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
@TableName("system_clazz")
@ApiModel(value="Clazz对象", description="")
public class Clazz implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "班级ID")
    @TableId(value = "clazz_id", type = IdType.ID_WORKER_STR)
    private String clazzId;

    @ApiModelProperty(value = "班级名称")
    private String clazzName;

    @ApiModelProperty(value = "开课时间")
    private Date clazzStart;

    @ApiModelProperty(value = "结课时间")
    private Date clazzEnd;

    @ApiModelProperty(value = "是否结课 0(未结课) 1(已结课)")
    private Integer isEnding;

    @ApiModelProperty(value = "教室位置")
    private String clazzAdress;

    @ApiModelProperty(value = "所属课程ID")
    private String courseId;

    @ApiModelProperty(value = "逻辑删除 0(未删除) 1(已删除)")
    @TableLogic
    private Boolean deleted;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
