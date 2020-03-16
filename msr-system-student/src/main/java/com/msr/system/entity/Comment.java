package com.msr.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("system_comment")
@ApiModel(value="Comment对象", description="")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生点评编号")
    @TableId(value = "comment_id", type = IdType.ID_WORKER_STR)
    private String commentId;

    @ApiModelProperty(value = "学生点评等级")
    private String score;

    @ApiModelProperty(value = "点评内容")
    private String commentContent;

    @ApiModelProperty(value = "点评教师ID")
    private String teacherId;

    @ApiModelProperty(value = "受点评学生ID")
    private String studentId;


}
