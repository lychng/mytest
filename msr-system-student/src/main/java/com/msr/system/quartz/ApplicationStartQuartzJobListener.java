package com.msr.system.quartz;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.core.QuartzScheduler;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

//@Configuration
//public class ApplicationStartQuartzJobListener implements ApplicationListener<ContextRefreshedEvent> {
//    @Autowired
//    private QuartzSchedulerAdmin quartzSchedulerAdmin;
//    /**
//     *  初始注入scheduler
//     *
//     */
//    @Bean
//    public Scheduler scheduler(){
//        StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
//        try {
//            return stdSchedulerFactory.getScheduler();
//        } catch (SchedulerException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    /**
//     *  初始启动quartz
//     * @param event
//     */
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        quartzSchedulerAdmin.startJob(this.scheduler());
//
//    }


//}
