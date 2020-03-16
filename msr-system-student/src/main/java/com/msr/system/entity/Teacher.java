package com.msr.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Liyanchong
 * @since 2020-03-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("system_teacher")
@ApiModel(value="Teacher对象", description="")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "教师ID")
    @TableId(value = "teacher_id", type = IdType.ID_WORKER_STR)
    private String teacherId;

    @ApiModelProperty(value = "教师姓名")
    private String teacherName;

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

    @ApiModelProperty(value = "逻辑删除 0 (未删除) 1(已删除)")
    @TableLogic
    private Boolean deleted;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
