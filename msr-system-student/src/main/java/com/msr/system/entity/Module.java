package com.msr.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
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
@TableName("system_module")
@ApiModel(value="Module对象", description="")
public class Module implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "模块ID")
    @TableId(value = "module_id", type = IdType.ID_WORKER_STR)
    private String moduleId;

    @ApiModelProperty(value = "模块名称")
    private String moduleName;

    @ApiModelProperty(value = "模块路径")
    private String modulePath;

    @ApiModelProperty(value = "父类模块ID")
    private String moduleParent;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
