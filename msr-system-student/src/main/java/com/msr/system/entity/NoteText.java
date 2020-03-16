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
@TableName("system_note_text")
@ApiModel(value="NoteText对象", description="")
public class NoteText implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "笔记编号")
    @TableId(value = "note_id", type = IdType.ID_WORKER_STR)
    private String noteId;

    @ApiModelProperty(value = "笔记内容")
    private String noteText;


}
