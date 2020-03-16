package com.msr.system.service;

import com.msr.system.entity.Attendance;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Date;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Liyanchong
 * @since 2020-03-12
 */
public interface AttendanceService extends IService<Attendance> {
    //添加学生考勤
    int addAttendance(String id, Date date);
    //自动生成学生考勤
    void autoAddAttendance(String studentId ,Date date);
    //学生签到(教师)更新考勤记录
    int updateAttendance(String studentId, Date date);
    //教师删除学生考勤记录
    int deleteAttendance(String studentId, Date date);
}
