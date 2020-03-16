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
@TableName("system_attendance")
@ApiModel(value="Attendance对象", description="")
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "考勤ID")
    @TableId(value = "attendance_id", type = IdType.ID_WORKER_STR)
    private String attendanceId;

    @ApiModelProperty(value = "考勤学生ID")
    private String studentId;

    @ApiModelProperty(value = "考勤日期")
    private Date attendanceDate;

    @ApiModelProperty(value = "第一节课 x(缺勤) o(出勤)")
    private String courseNo1;

    @ApiModelProperty(value = "第二节课 x(缺勤) o(出勤)")
    private String courseNo2;

    @ApiModelProperty(value = "第三节课 x(缺勤) o(出勤)")
    private String courseNo3;

    @ApiModelProperty(value = "第四节课 x(缺勤) o(出勤)")
    private String courseNo4;

    @ApiModelProperty(value = "第五节课 x(缺勤) o(出勤)")
    private String courseNo5;

    @ApiModelProperty(value = "第六节课 x(缺勤) o(出勤)")
    private String courseNo6;

    @ApiModelProperty(value = "第七节课 x(缺勤) o(出勤)")
    private String courseNo7;

    @ApiModelProperty(value = "第八节课 x(缺勤) o(出勤)")
    private String courseNo8;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
