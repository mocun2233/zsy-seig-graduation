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
@TableName("graduation_project_topic")
@ApiModel(value="GraduationProjectTopic对象", description="")
public class GraduationProjectTopic implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "题目名称")
    private String titleName;

    @ApiModelProperty(value = "题目来源")
    private String titleSource;

    @ApiModelProperty(value = "功能要求")
    private String titleRequirement;

    @ApiModelProperty(value = "技术要求")
    private String technicalRequirement;

    @ApiModelProperty(value = "指导老师id")
    private Integer teacherId;

    @ApiModelProperty(value = "面向专业id")
    private Integer majorId;

    @ApiModelProperty(value = "审批状态")
    private Integer status;


}
