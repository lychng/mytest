//package com.msr.system.quartz;
//
//import com.msr.system.quartz.job.AttendanceJob;
//import org.quartz.*;
//import org.springframework.context.annotation.Configuration;
//
///**
// * 任务调度处理
// */
//@Configuration
//public class QuartzSchedulerAdmin {
//
//    //开始执行任务
//    public void startJob(Scheduler scheduler){
//        startAttendanceJob(scheduler);
//
//    }
//
//    private void startAttendanceJob(Scheduler scheduler) {
//        JobDetail jobDetail =JobBuilder.newJob(AttendanceJob.class).withIdentity("job1","group1").build();
//        //基于表达式构建触发器
//        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0 19 18 ? * MON-FRI");
//        //
//        CronTrigger cronTrigger = TriggerBuilder.newTrigger().withIdentity("job1","group1").withSchedule(cronScheduleBuilder).build();
//        try {
//            scheduler.scheduleJob(jobDetail,cronTrigger);
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//}
