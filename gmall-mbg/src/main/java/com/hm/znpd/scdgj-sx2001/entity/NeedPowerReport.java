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
 * 需量报表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="NeedPowerReport对象", description="需量报表")
public class NeedPowerReport implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "企业id")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = "站房id")
    @TableField("station_id")
    private Integer stationId;

    @ApiModelProperty(value = "进线id")
    @TableField("device_id")
    private Integer deviceId;

    @ApiModelProperty(value = "月度需量")
    @TableField("month_need")
    private Float monthNeed;

    @ApiModelProperty(value = "需量状态(0正常申报1高2低)")
    @TableField("month_need_status")
    private Integer monthNeedStatus;

    @ApiModelProperty(value = "年度")
    @TableField("years")
    private Integer years;

    @ApiModelProperty(value = "月份")
    @TableField("months")
    private Integer months;

    @ApiModelProperty(value = "申请人id")
    @TableField("proposer_id")
    private Integer proposerId;

    @ApiModelProperty(value = "申请人")
    @TableField("proposer")
    private String proposer;

    @ApiModelProperty(value = "提交时间")
    @TableField("submit_time")
    private Date submitTime;

    @ApiModelProperty(value = "申报状态(0待提交1待确认2已确认)")
    @TableField("approval_status")
    private Integer approvalStatus;


}
