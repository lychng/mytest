package com.msr.system.form;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@ApiModel(value = "老师信息类", description = "接收前台输入信息")
public class TeacherInfoForm implements Serializable {
    @ApiModelProperty(value = "教师ID")
    @TableId(value = "teacher_id", type = IdType.ID_WORKER_STR )
    private String teacherId;

    @ApiModelProperty(value = "教师姓名")
    private String teacherName;

    @ApiModelProperty(value = "用户密码")
    private String userPwd;

    @ApiModelProperty(value = "用户角色ID")
    private String roleId;

    @ApiModelProperty(value = "用户mac地址")
    private String mac;

    @ApiModelProperty(value = "是否为第一次登陆(0 是,1 否)")
    private Integer isFirst;

    @ApiModelProperty(value = "教师性别0(保密) 1(男士) 2(女士)")
    private Integer teacherGender;

    @ApiModelProperty(value = "教师电话")
    private String teacherTel;

    @ApiModelProperty(value = "教师头像")
    private String teacharAvatar;

    @ApiModelProperty(value = "教师住址")
    private String teacherAddress;

    @ApiModelProperty(value = "入职时间")
    private Date hiredate;


}
