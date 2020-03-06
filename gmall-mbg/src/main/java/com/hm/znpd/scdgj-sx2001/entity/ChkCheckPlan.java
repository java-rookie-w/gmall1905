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
 * 巡检计划
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ChkCheckPlan对象", description="巡检计划")
public class ChkCheckPlan implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "计划编号")
    @TableField("no")
    private String no;

    @ApiModelProperty(value = "计划名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "用电企业ID")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = "计划类型（字典表）")
    @TableField("plan_type_id")
    private Integer planTypeId;

    @ApiModelProperty(value = "巡检用车（巡检车辆，sys_car_info表的主键）")
    @TableField("use_car_id")
    private Integer useCarId;

    @ApiModelProperty(value = "计划开始日期")
    @TableField("begain_date")
    private Date begainDate;

    @ApiModelProperty(value = "计划结束日期")
    @TableField("end_date")
    private Date endDate;

    @ApiModelProperty(value = "计划状态(字典表)")
    @TableField("plan_state_id")
    private Integer planStateId;

    @ApiModelProperty(value = "巡检计划巡检结果 0正常， 1有缺陷")
    @TableField("check_result")
    private Integer checkResult;

    @ApiModelProperty(value = "实际完成日期")
    @TableField("real_end_date")
    private Date realEndDate;

    @ApiModelProperty(value = "负责人")
    @TableField("person_in_charge")
    private Integer personInCharge;

    @ApiModelProperty(value = "编制人")
    @TableField("create_user_id")
    private Integer createUserId;

    @ApiModelProperty(value = "编制日期")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    @TableField("update_user_id")
    private Integer updateUserId;

    @ApiModelProperty(value = "更新日期")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "对应周期计划的ID")
    @TableField("cycleplan_id")
    private Integer cycleplanId;

    @ApiModelProperty(value = "自动创建周期计划时，记录上一个巡检计划")
    @TableField("parent_id")
    private Integer parentId;

    @ApiModelProperty(value = "巡视轨迹点")
    @TableField("check_point")
    private String checkPoint;

    @ApiModelProperty(value = "审核状态 0 未审核  1 已审核")
    @TableField("flag")
    private Integer flag;

    @ApiModelProperty(value = "经理")
    @TableField("manager")
    private String manager;

    @ApiModelProperty(value = "实际开始时间")
    @TableField("real_start_time")
    private Date realStartTime;

    @ApiModelProperty(value = "下发时间")
    @TableField("lower_hair_time")
    private Date lowerHairTime;

    @ApiModelProperty(value = "用户意见")
    @TableField("opinoin")
    private String opinoin;

    @ApiModelProperty(value = "下发人员")
    @TableField("autograph")
    private String autograph;

    @ApiModelProperty(value = "该计划是否启用 0：启用 1：不启用")
    @TableField("enable")
    private String enable;

    @ApiModelProperty(value = "real_end_date2")
    @TableField("real_end_date2")
    private Date realEndDate2;

    @ApiModelProperty(value = "real_start_time2")
    @TableField("real_start_time2")
    private Date realStartTime2;


}
