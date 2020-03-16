package com.msr.system.controller.admin;

import com.msr.system.form.StudentInfoForm;
import com.msr.system.service.StudentService;
import com.msr.system.utils.IPUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin //跨域
@RestController //规定返回数据类型
@RequestMapping("admin/system/student")
@Api(description = "学生管理")
public class StudentAdminController {
    @Autowired
    private StudentService studentService;
    @ApiOperation(value = "添加学生")
    @PostMapping("save-student-info")
    public String saveStudentInfo(
            @ApiParam(name = "StudentInfoForm",value = "学生基本信息",required = true)
            @RequestBody StudentInfoForm studentInfoForm ,
            HttpServletRequest httpServletRequest){
        //获取IP地址
        String ipAddr = IPUtils.getIpAddr(httpServletRequest);

        //获取Mac地址
        String macAddress = IPUtils.getMACAddress(ipAddr);
        //将Mac地址存入信息对象
        //studentInfoForm.setMac(macAddress);

        String studentId = studentService.saveStudentInfo(studentInfoForm);
        return studentId;
    }

}
