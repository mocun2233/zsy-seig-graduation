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
@TableName("guidance_record")
@ApiModel(value="GuidanceRecord对象", description="")
public class GuidanceRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "指导类别id")
    private Integer typeId;

    @ApiModelProperty(value = "指导主题")
    private String guidanceTopic;

    @ApiModelProperty(value = "指导内容")
    private String guidanceContent;

    @ApiModelProperty(value = "指导时间")
    private String guidanceTime;

    @ApiModelProperty(value = "指导老师id")
    private Integer teacherId;

    @ApiModelProperty(value = "指导学生id")
    private Integer studentId;


}
