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
@TableName("system_student")
@ApiModel(value="Student对象", description="")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生ID")
    @TableId(value = "student_id", type = IdType.ID_WORKER_STR)
    private String studentId;

    @ApiModelProperty(value = "学生姓名")
    private String studentName;

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

    @ApiModelProperty(value = "是否毕业")
    @TableField(value = "is_graduate")
    private String graduate;

    @ApiModelProperty(value = "逻辑删除 0 (未删除) 1(已删除)")
    @TableLogic
    @TableField(value = "is_deleted")
    private Boolean deleted;

    @ApiModelProperty(value = "所属会社ID")
    private String companyId;

    @ApiModelProperty(value = "所属班级ID")
    private String clazzId;

    @ApiModelProperty(value = "学生备注")
    private String remark;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
