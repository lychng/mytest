package com.msr.system.form;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@ApiModel(value = "学生信息对象",description = "接受学生信息")
public class StudentInfoForm implements Serializable {
    @ApiModelProperty(value = "学生账号")

    private String studentId;

    @ApiModelProperty(value = "学生姓名")
    private String studentName;

    @ApiModelProperty(value = "用户密码")
    private String userPwd;

    @ApiModelProperty(value = "用户角色ID")
    private String roleId;

    @ApiModelProperty(value = "用户mac地址")
    private String mac;

    @ApiModelProperty(value = "是否为第一次登陆(0 是,1 否)")
    private Integer isFirst;

    @ApiModelProperty(value = "学生性别 0(保密) 1(男士) 2(女士)")
    private Integer studentGender;

    @ApiModelProperty(value = "学生头像")
    private String avatar;

    @ApiModelProperty(value = "学生生日")
    private String birthday;

    @ApiModelProperty(value = "学生日语等级 1(N1) 2(N2) 3(N3) 4(N4) 5(N5) 0(默认未知)")
    private Integer studentJlpt;

    @ApiModelProperty(value = "学生电话")
    private String studentTel;

    @ApiModelProperty(value = "紧急联系人电话")
    private String contactTel;

    @ApiModelProperty(value = "学生住址")
    private String studentAddress;



    @ApiModelProperty(value = "所属会社ID")
    private String companyId;

    @ApiModelProperty(value = "所属班级ID")
    private String clazzId;

    @ApiModelProperty(value = "学生备注")
    private String remark;




}
