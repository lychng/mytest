package com.msr.system.service;

import com.msr.system.entity.Student;
import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.system.form.StudentInfoForm;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Liyanchong
 * @since 2020-03-12
 */
public interface StudentService extends IService<Student> {
    //添加学生信息
    String saveStudentInfo(StudentInfoForm studentInfoForm);
    //获取没毕业的学生列表
    List<Student> getStudentList();
}
