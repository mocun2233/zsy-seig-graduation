package com.seig.zsy.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * @author 卓世源
 * @since 2024-05-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("defense_arrangement_teacher")
@ApiModel(value="DefenseArrangementTeacher对象", description="")
public class DefenseArrangementTeacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "答辩老师id")
    private Integer teacherId;

    @ApiModelProperty(value = "答辩教室id")
    private Integer classroomId;

    @ApiModelProperty(value = "答辩时间")
    private String defenseTime;

    @ApiModelProperty(value = "是否为组长")
    private Integer isTeamLeader;

    @ApiModelProperty(value = "分配专业id")
    private Integer majorId;


}
