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
 * 缺陷信息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ChkBug对象", description="缺陷信息")
public class ChkBug implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "缺陷编号")
    @TableField("no")
    private String no;

    @ApiModelProperty(value = "巡检计划ID(chk_check_plan表主键）")
    @TableField("check_plan_id")
    private Integer checkPlanId;

    @ApiModelProperty(value = "巡检内容ID")
    @TableField("check_content_id")
    private Integer checkContentId;

    @ApiModelProperty(value = "用电企业ID")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = " 缺陷性质(字典表)")
    @TableField("bug_level_id")
    private Integer bugLevelId;

    @ApiModelProperty(value = " 缺陷来源(字典表)")
    @TableField("bug_source")
    private Integer bugSource;

    @ApiModelProperty(value = "发现人")
    @TableField("report_person")
    private String reportPerson;

    @ApiModelProperty(value = "发现时间")
    @TableField("report_time")
    private Date reportTime;

    @ApiModelProperty(value = "消缺时间")
    @TableField("solve_time")
    private Date solveTime;

    @ApiModelProperty(value = "缺陷设备ID(sys_equipment表主键)")
    @TableField("bug_equipment_id")
    private Integer bugEquipmentId;

    @ApiModelProperty(value = "缺陷描述")
    @TableField("bug_description")
    private String bugDescription;

    @ApiModelProperty(value = "缺陷风险")
    @TableField("bug_risk")
    private String bugRisk;

    @ApiModelProperty(value = "解决方案建议")
    @TableField("solution_suggestion")
    private String solutionSuggestion;

    @ApiModelProperty(value = "缺陷状态(字典表）")
    @TableField("bug_state_id")
    private Integer bugStateId;

    @ApiModelProperty(value = "负责人")
    @TableField("person_in_charge")
    private Integer personInCharge;

    @ApiModelProperty(value = "解决措施")
    @TableField("treating_measur")
    private String treatingMeasur;

    @ApiModelProperty(value = "不处理原因")
    @TableField("ignore_reason")
    private String ignoreReason;

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

    @ApiModelProperty(value = "故障用户（一键报修）")
    @TableField("customer_addr")
    private String customerAddr;

    @ApiModelProperty(value = "报修电话（一键报修）")
    @TableField("bug_user_phone")
    private String bugUserPhone;

    @ApiModelProperty(value = "是否停电（1-不停电，2-停电）一键报修")
    @TableField("power")
    private Integer power;

    @ApiModelProperty(value = "告警事件id(=alm_alarm_data.id)")
    @TableField("alarmDataId")
    private Integer alarmDataId;


}
