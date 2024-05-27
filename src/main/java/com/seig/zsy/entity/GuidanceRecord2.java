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
@TableName("guidance_record2")
@ApiModel(value="GuidanceRecord2对象", description="")
public class GuidanceRecord2 implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "学生id")
    private Integer studentId;

    @ApiModelProperty(value = "课程id")
    private Integer courseId;

    @ApiModelProperty(value = "实习类型")
    private String internshipType;

    @ApiModelProperty(value = "实现组织方式")
    private String internshipOrganizationMethod;

    @ApiModelProperty(value = "实习方式")
    private String internshipMode;

    @ApiModelProperty(value = "学年id")
    private Integer academicYearId;

    @ApiModelProperty(value = "指导老师id")
    private Integer teacherId;

    @ApiModelProperty(value = "实习单位")
    private String internshipOrganization;

    @ApiModelProperty(value = "实习单位统一信用代码")
    private String internshipOrganizationCode;

    @ApiModelProperty(value = "实习地区")
    private String internshipArea;

    @ApiModelProperty(value = "实习地区代码")
    private String internshipAreaCode;

    @ApiModelProperty(value = "实习详细地址")
    private String internshipdetail;

    @ApiModelProperty(value = "实习开始时间")
    private String startTime;

    @ApiModelProperty(value = "实习结束时间")
    private String endTime;

    @ApiModelProperty(value = "实习天数")
    private Integer internshipDays;

    @ApiModelProperty(value = "实习岗位")
    private String internshipJob;

    @ApiModelProperty(value = "实习报酬")
    private Float internshipPay;

    @ApiModelProperty(value = "企业指导老师")
    private String enterpriseMentor;


}
