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
@TableName("system_company")
@ApiModel(value="Company对象", description="")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "会社ID")
    @TableId(value = "company_id", type = IdType.ID_WORKER_STR)
    private String companyId;

    @ApiModelProperty(value = "会社名称")
    private String companyName;

    @ApiModelProperty(value = "会社所在地")
    private String companyAddress;

    @ApiModelProperty(value = "会社联系电话")
    private String companyTel;

    @ApiModelProperty(value = "会社法人")
    private String companyBoss;

    @ApiModelProperty(value = "逻辑删除 0 (未删除) 1(已删除)")
    @TableLogic
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
