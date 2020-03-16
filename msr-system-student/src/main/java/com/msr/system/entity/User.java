package com.msr.system.entity;

import com.baomidou.mybatisplus.annotation.*;

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
@TableName("system_user")
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户账号")
    @TableId(value = "user_id", type = IdType.INPUT )
    private String userId;

    @ApiModelProperty(value = "用户姓名")

    private String userName;

    @ApiModelProperty(value = "用户密码")
    private String userPwd;

    @ApiModelProperty(value = "用户角色ID")
    private String roleId;

    @ApiModelProperty(value = "用户mac地址")
    private String mac;

    @ApiModelProperty(value = "是否为第一次登陆(0 是,1 否)")
    private Integer isFirst;


}
