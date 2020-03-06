package com.hm.znpd.scdgj-sx2001.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户评价
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysUserevaluate对象", description="用户评价")
public class SysUserevaluate implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "企业Id")
    @TableField("userId")
    private String userId;

    @ApiModelProperty(value = "巡检或缺陷单号")
    @TableField("xjOrqxNumbers")
    private String xjOrqxNumbers;

    @ApiModelProperty(value = "巡检Id")
    @TableField("planId")
    private String planId;

    @ApiModelProperty(value = "负责人")
    @TableField("personInCharge")
    private String personInCharge;

    @ApiModelProperty(value = "巡检/抢修类型")
    @TableField("xjOrqxType")
    private String xjOrqxType;

    @ApiModelProperty(value = "巡检日期")
    @TableField("xjTime")
    private String xjTime;

    @ApiModelProperty(value = "及时性星级")
    @TableField("timeliness")
    private String timeliness;

    @ApiModelProperty(value = "及时性原因(低于三星时)")
    @TableField("timelinessReason")
    private String timelinessReason;

    @ApiModelProperty(value = "服务态度星级")
    @TableField("serviceStar")
    private String serviceStar;

    @ApiModelProperty(value = "服务态度原因(低于三星时)")
    @TableField("serviceStarReason")
    private String serviceStarReason;

    @ApiModelProperty(value = "技能水平星级")
    @TableField("skillStar")
    private String skillStar;

    @ApiModelProperty(value = "技能水平原因(低于三星时)")
    @TableField("skillReason")
    private String skillReason;

    @ApiModelProperty(value = "服务质量星级")
    @TableField("serviceQuality")
    private String serviceQuality;

    @ApiModelProperty(value = "服务质量原因(低于三星时)")
    @TableField("serviceQualityReason")
    private String serviceQualityReason;

    @ApiModelProperty(value = "0-未阅-1已阅")
    @TableField("readState")
    private String readState;


}
