package com.msr.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.msr.system.entity.Attendance;
import com.msr.system.mapper.AttendanceMapper;
import com.msr.system.service.AttendanceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Liyanchong
 * @since 2020-03-12
 */
@Service
public class AttendanceServiceImpl extends ServiceImpl<AttendanceMapper, Attendance> implements AttendanceService {
    /**
     *   根据学生ID和考勤时间，添加学生考勤
     * @param id
     * @param date
     * @return
     */
    @Override
    public int addAttendance(String id, Date date) {
        //指定日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        // 确定签到小时时间

        int hour = calendar.get(calendar.HOUR_OF_DAY );
       // System.out.println(hour);

        if( hour < 9 ){
            Attendance attendance = new Attendance();
            attendance.setStudentId(id);
            attendance.setAttendanceDate(date);
            attendance.setCourseNo1("o");
            attendance.setCourseNo2("o");
            attendance.setCourseNo3("o");
            attendance.setCourseNo4("o");
            attendance.setCourseNo5("o");
            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert1 = baseMapper.insert(attendance);
            return insert1;
        }
        if(hour < 10 ){
            Attendance attendance = new Attendance();
            attendance.setStudentId(id);
            attendance.setAttendanceDate(date);
            attendance.setCourseNo2("o");
            attendance.setCourseNo3("o");
            attendance.setCourseNo4("o");
            attendance.setCourseNo5("o");
            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert2 = baseMapper.insert(attendance);
            return insert2;
        }
        if(hour < 11 ){
            Attendance attendance = new Attendance();
            attendance.setStudentId(id);
            attendance.setAttendanceDate(date);

            attendance.setCourseNo3("o");
            attendance.setCourseNo4("o");
            attendance.setCourseNo5("o");
            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert3 = baseMapper.insert(attendance);
            return insert3;
        }
        if(hour < 13 ){
            Attendance attendance = new Attendance();
            attendance.setStudentId(id);
            attendance.setAttendanceDate(date);


            attendance.setCourseNo4("o");
            attendance.setCourseNo5("o");
            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert4 = baseMapper.insert(attendance);
            return insert4;
        }
        if(hour < 14 ){
            Attendance attendance = new Attendance();
            attendance.setStudentId(id);
            attendance.setAttendanceDate(date);
            attendance.setCourseNo5("o");
            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert5 = baseMapper.insert(attendance);
            return insert5;
        }
        if(hour < 15 ){
            Attendance attendance = new Attendance();
            attendance.setStudentId(id);
            attendance.setAttendanceDate(date);

            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert6 = baseMapper.insert(attendance);
            return insert6;
        }
        if(hour < 16 ){
            Attendance attendance = new Attendance();
            attendance.setStudentId(id);
            attendance.setAttendanceDate(date);
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert7 = baseMapper.insert(attendance);
            return insert7;
        }
        if(hour < 17 ){
            Attendance attendance = new Attendance();
            attendance.setStudentId(id);
            attendance.setAttendanceDate(date);
            attendance.setCourseNo8("o");

            int insert8 = baseMapper.insert(attendance);
            return insert8;
        }
        if (hour >= 17){
            return 0;
        }
        return 0 ;
    }

    /**
     *  系统每天六点,自动生成学生考勤记录
     * @param studentId
     * @param date
     */
    @Override
    public void autoAddAttendance(String studentId,Date date) {
        Attendance attendance = new Attendance();
        attendance.setStudentId(studentId);
        attendance.setAttendanceDate(date);
        baseMapper.insert(attendance);
    }

    /**
     *   学生签到后更新考勤记录
     * @param studentId
     * @param date
     * @return
     */
    @Override
    public int updateAttendance(String studentId, Date date) {

        //指定日期
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //签到日期固定格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(date);
        Date date1 = null;
        try {
             date1 = format.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 确定签到小时时间

        int hour = calendar.get(calendar.HOUR_OF_DAY );

        QueryWrapper<Attendance> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_id",studentId);
        queryWrapper.eq("attendance_date",date1);
        Attendance attendance = new Attendance();
        attendance.setStudentId(studentId);
        attendance.setAttendanceDate(date);

        if( hour>=6 && hour < 9 ){


            attendance.setCourseNo1("o");
            attendance.setCourseNo2("o");
            attendance.setCourseNo3("o");
            attendance.setCourseNo4("o");
            attendance.setCourseNo5("o");
            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert = baseMapper.update(attendance,queryWrapper);
            return insert;
        }
        if(hour < 10 ){

            attendance.setCourseNo2("o");
            attendance.setCourseNo3("o");
            attendance.setCourseNo4("o");
            attendance.setCourseNo5("o");
            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert = baseMapper.update(attendance,queryWrapper);
            return insert;
        }
        if(hour < 11 ){


            attendance.setCourseNo3("o");
            attendance.setCourseNo4("o");
            attendance.setCourseNo5("o");
            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert = baseMapper.update(attendance,queryWrapper);
            return insert;
        }
        if(hour < 13 ){


            attendance.setCourseNo4("o");
            attendance.setCourseNo5("o");
            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");
            attendance.setGmtCreate(date);
            attendance.setGmtModified(date);
            int insert = baseMapper.update(attendance,queryWrapper);
            return insert;
        }
        if(hour < 14 ){

            attendance.setCourseNo5("o");
            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");
            attendance.setGmtCreate(date);
            attendance.setGmtModified(date);
            int insert = baseMapper.update(attendance,queryWrapper);
            return insert;
        }
        if(hour < 15 ){


            attendance.setCourseNo6("o");
            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");
            attendance.setGmtCreate(date);
            attendance.setGmtModified(date);
            int insert = baseMapper.update(attendance,queryWrapper);
            return insert;
        }
        if(hour < 16 ){

            attendance.setCourseNo7("o");
            attendance.setCourseNo8("o");

            int insert = baseMapper.update(attendance,queryWrapper);
            return insert;
        }
        if(hour < 17 ){

            attendance.setCourseNo8("o");

            int insert = baseMapper.update(attendance,queryWrapper);
            return insert;
        }
        if (hour >= 17){
            return 0;
        }
        return 0 ;
    }

    @Override
    public int deleteAttendance(String studentId, Date date) {
        //转换日期格式
        //签到日期固定格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = format.format(date);
        Date date1 = null;
        try {
             date1 = format.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        QueryWrapper<Attendance> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_id",studentId);
        queryWrapper.eq("attendance_date",date1);
        int delete = baseMapper.delete(queryWrapper);
        return delete;
    }
}








