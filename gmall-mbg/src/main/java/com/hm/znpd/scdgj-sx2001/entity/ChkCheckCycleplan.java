package com.hm.znpd.scdgj-sx2001.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
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
 * 周期计划管理
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ChkCheckCycleplan对象", description="周期计划管理")
public class ChkCheckCycleplan implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = " 用电企业ID")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = "周期（天）")
    @TableField("cycle")
    private Integer cycle;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty(value = "创建人")
    @TableField("create_user_id")
    private Integer createUserId;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    @TableField("update_user_id")
    private Integer updateUserId;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "第一次巡检时间")
    @TableField("start_time")
    private Date startTime;

    @ApiModelProperty(value = "第二次巡检时间")
    @TableField("end_time")
    private Date endTime;

    @ApiModelProperty(value = "巡检类型")
    @TableField("check_type")
    private Integer checkType;

    @ApiModelProperty(value = "巡检负责人【新增字段】")
    @TableField("person_in_charge")
    private Integer personInCharge;

    @ApiModelProperty(value = "巡检部门【新增字段】")
    @TableField("check_depart")
    private Integer checkDepart;


}
