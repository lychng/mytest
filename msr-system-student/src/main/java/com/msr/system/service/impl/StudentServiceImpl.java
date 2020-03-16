package com.msr.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.msr.system.entity.Student;
import com.msr.system.entity.User;
import com.msr.system.form.StudentInfoForm;
import com.msr.system.mapper.StudentMapper;
import com.msr.system.mapper.UserMapper;
import com.msr.system.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Liyanchong
 * @since 2020-03-12
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
    @Autowired
    private UserMapper userMapper;
    @Transactional
    @Override
    public String saveStudentInfo(StudentInfoForm studentInfoForm) {
        //存入学生信息
        Student student = new Student();
        //将学生信息拷贝
        BeanUtils.copyProperties(studentInfoForm,student);
        baseMapper.insert(student);

        /**
         *  存入用户信息
         */

        User user = new User();
        //将学生信息存入用户
        BeanUtils.copyProperties(studentInfoForm,user);
        user.setUserId(student.getStudentId());
        user.setUserName(student.getStudentName());
        userMapper.insert(user);
        //返回学生账号
        return student.getStudentId();
    }

    /**
     * 获取未毕业学生列表
     *
     * @return
     */
    @Override
    public List<Student> getStudentList() {
        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("is_graduate",0);

        List<Student> students = baseMapper.selectList(queryWrapper);
        return students;
    }
}
