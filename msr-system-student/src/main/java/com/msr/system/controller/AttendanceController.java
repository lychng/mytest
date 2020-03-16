package com.msr.system.controller;


import com.msr.system.service.AttendanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Liyanchong
 * @since 2020-03-12
 */
@Api(description = "学生考勤模块")
@CrossOrigin //跨域
@RestController
@RequestMapping("/system/attendance")
public class AttendanceController {
    @Autowired
    private AttendanceService attendanceService;
    /**
     *  根据学生id和签到时间,进行考勤记录修改
     */
    @ApiOperation(value = "学生本人签到")
    @PutMapping("{studentId}/{date}")
    public String updateAttendance(

            @PathVariable String studentId,
            @PathVariable Date date ){
        int update = attendanceService.updateAttendance(studentId, date);
        if (update>0){
            return "签到成功";
        }else {
            return "签到失败";
        }










    }

}

