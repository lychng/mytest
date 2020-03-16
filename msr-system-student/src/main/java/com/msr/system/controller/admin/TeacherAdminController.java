package com.msr.system.controller.admin;

import com.msr.system.form.TeacherInfoForm;
import com.msr.system.service.TeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(description = "老师管理")
@RequestMapping ("admin/system/teacher")
@CrossOrigin //跨域
@RestController //数据格式
public class TeacherAdminController {
    @Autowired
    private TeacherService teacherService;
    @ApiOperation(value = "添加老师")
    @PostMapping("save-teacher-info")
    public String saveTeacherInfo(
            @ApiParam()
            @RequestBody TeacherInfoForm teacherInfoForm ){
        return null;

    }

}
