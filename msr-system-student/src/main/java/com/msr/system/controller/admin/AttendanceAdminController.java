package com.msr.system.controller.admin;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.msr.system.service.AttendanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin //跨域
@RestController //规定返回数据类型
@RequestMapping("admin/system/attendance")
@Api(description = "考勤管理模块")
public class AttendanceAdminController {
    @Autowired
    private AttendanceService attendanceService;

    /**
     *
     * @param id
     * @param date  时间精确到小时
     * @return
     */
    @ApiOperation(value = "教师根据学生ID添加考勤记录")
    @PostMapping("{id}/{date}")
    public String addAttendance(
            @ApiParam(name = "id",value = "学生ID",required = true)
            @PathVariable String id,
            @ApiParam(name = "date",value = "签到时间",required = true)
            @PathVariable Date date ){

        int insert = attendanceService.addAttendance(id, date);
        if (insert > 0){
            return "添加成功";
        }else {
            return "添加失败";
        }

    }

    /**
     *
     * @param studentId
     * @param date 时间精确到小时
     * @return
     */
    @ApiOperation(value = "教师修改学生考勤记录")
    @PutMapping("{studentId}/{date}")
    public String updateStudentAttendance(
            @ApiParam(name = "studentId",value = "学生ID",required = true)
            @PathVariable String studentId,
            @ApiParam(name = "date",value = "签到时间",required = true)
            @PathVariable Date date  ){
        int update = attendanceService.updateAttendance(studentId, date);
        if (update > 0){
            return "修改成功";
        }else {
            return "修改失败";
        }

    }

    /**
     *
     * @param studentId
     * @param date  日期精确到天即可
     * @return
     */
    @ApiOperation(value = "教师删除学生考勤记录")
    @DeleteMapping("{studentId}/{date}")
    public String deleteStudentAttendance(
            @ApiParam(name = "studentId",value = "学生ID",required = true)
            @PathVariable String studentId,
            @ApiParam(name = "date",value = "签到时间",required = true)
            @PathVariable Date date  ){
        int update = attendanceService.deleteAttendance(studentId, date);
        if (update > 0){
            return "删除成功";
        }else {
            return "修改失败";
        }

    }


}
