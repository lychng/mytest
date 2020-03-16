package com.msr.system.quartz.job;

import com.msr.system.entity.Student;
import com.msr.system.service.AttendanceService;
import com.msr.system.service.StudentService;
import com.msr.system.utils.HolidayUtils;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *   签到任务类
 *  实现工作日每天五点半点生成签到纪录，默认记录为缺勤，需要学生实际签到进行数据更新
 */
@Component
public class AttendanceJob  {
      @Autowired
      private StudentService studentService;
      @Autowired
      private AttendanceService attendanceService;
//    @Override
//    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        //业务代码：遍历每个班级的所有学生，自动生成考勤记录
//        System.out.println("定时打印出勤方法。。。。");
//    }
    // "0 30 05 ? * MON-FRI"   "0 31 16 * * ?"
    @Scheduled(cron = "0 30 05 ? * MON-FRI" )
    public void setAttendanceInfo() throws ParseException {


        //当天日期
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        String dateString = simpleDateFormat.format(date);
        //转换成规定格式的时间
        //Date date1 = simpleDateFormat.parse(dateString);
        //判断当天是否为节假日
        boolean contains = HolidayUtils.getHoliday().contains(dateString);
        //如果为非法定假日，生成考勤记录
        if (! contains){
            //获取学生列表
            List<Student> studentList = studentService.getStudentList();
            //遍历列表,获取所有学生ID
            for(Student student : studentList){
                //获取学生Id
                String studentId = student.getStudentId();
                //调用考勤服务层方法，完成数据存储
                attendanceService.autoAddAttendance(studentId,date);
            }


        }
    }
}
