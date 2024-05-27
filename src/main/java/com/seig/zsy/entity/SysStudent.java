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
@TableName("sys_student")
@ApiModel(value="SysStudent对象", description="")
public class SysStudent implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "学号")
    private String studentNum;

    @ApiModelProperty(value = "姓名")
    private String studentName;

    @ApiModelProperty(value = "专业编号")
    private Integer majorId;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "毕业学年id")
    private Integer academicYearId;

    @ApiModelProperty(value = "所属班级id")
    private Integer gClassId;

    @ApiModelProperty(value = "所属年级id")
    private Integer gradeId;

    @ApiModelProperty(value = "所属用户id")
    private Integer userId;


}
