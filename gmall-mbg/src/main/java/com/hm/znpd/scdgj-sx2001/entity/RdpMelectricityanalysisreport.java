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
 * 
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="RdpMelectricityanalysisreport对象", description="")
public class RdpMelectricityanalysisreport implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户id")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty(value = "用户名称")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "变压器（台）")
    @TableField("former")
    private Integer former;

    @ApiModelProperty(value = "容量（kVA）")
    @TableField("capacity")
    private String capacity;

    @ApiModelProperty(value = "安全运行（天）")
    @TableField("days")
    private String days;

    @ApiModelProperty(value = "巡检（次）")
    @TableField("pection")
    private Integer pection;

    @ApiModelProperty(value = "缺陷新增")
    @TableField("defect")
    private Integer defect;

    @ApiModelProperty(value = "缺陷消除")
    @TableField("elimination")
    private Integer elimination;

    @ApiModelProperty(value = "每日电量kWh")
    @TableField("everydaydl")
    private Integer everydaydl;

    @ApiModelProperty(value = "总用电量kWh")
    @TableField("totadl")
    private String totadl;

    @ApiModelProperty(value = "最高电量kWh")
    @TableField("maxdl")
    private String maxdl;

    @ApiModelProperty(value = "最低电量kWh")
    @TableField("mindl")
    private String mindl;

    @ApiModelProperty(value = "平均电量kWh")
    @TableField("avgdl")
    private String avgdl;

    @ApiModelProperty(value = "尖")
    @TableField("jian")
    private Integer jian;

    @ApiModelProperty(value = "峰")
    @TableField("feng")
    private Integer feng;

    @ApiModelProperty(value = "谷")
    @TableField("gu")
    private Integer gu;

    @ApiModelProperty(value = "平")
    @TableField("ping")
    private String ping;

    @ApiModelProperty(value = "峰谷用电评价")
    @TableField("fgpinfjia")
    private String fgpinfjia;

    @ApiModelProperty(value = "本月最大负荷")
    @TableField("monthmaxfe")
    private String monthmaxfe;

    @ApiModelProperty(value = "最大负荷发生时间")
    @TableField("monthmxafetime")
    private Date monthmxafetime;

    @ApiModelProperty(value = "本月平均负载")
    @TableField("monthavgload")
    private String monthavgload;

    @ApiModelProperty(value = "本月平均负载率")
    @TableField("monthavglaodl")
    private String monthavglaodl;

    @ApiModelProperty(value = "平均负载评价")
    @TableField("average")
    private String average;

    @ApiModelProperty(value = "评估日期")
    @TableField("pgTime")
    private String pgTime;

    @ApiModelProperty(value = "状态 0未发送 1已发送")
    @TableField("status")
    private String status;

    @ApiModelProperty(value = "客户地址")
    @TableField("cusAddress")
    private String cusAddress;

    @ApiModelProperty(value = "每日最大负荷")
    @TableField("Dailymaximumload")
    private String Dailymaximumload;

    @ApiModelProperty(value = "户号")
    @TableField("user_number")
    private String userNumber;

    @ApiModelProperty(value = "评估情况")
    @TableField("pgstatus")
    private String pgstatus;

    @ApiModelProperty(value = "APP已读状态：0-未读，1-已读")
    @TableField("isRead")
    private String isRead;

    @ApiModelProperty(value = "设备ID")
    @TableField("deviceId")
    private String deviceId;

    @ApiModelProperty(value = "报告类型，1-月度，2-季度，3-年度")
    @TableField("reportType")
    private String reportType;

    @ApiModelProperty(value = "注释:季度年份")
    @TableField("pgTimeSeason")
    private String pgTimeSeason;

    @ApiModelProperty(value = "是否隐藏 1-是 0-否")
    @TableField("hideYorN")
    private String hideYorN;

    @ApiModelProperty(value = "功率因数最大值")
    @TableField("cosMax")
    private String cosMax;

    @ApiModelProperty(value = "功率因数最小值")
    @TableField("cosMin")
    private String cosMin;

    @ApiModelProperty(value = "功率因数月均值")
    @TableField("cosAvg")
    private String cosAvg;

    @ApiModelProperty(value = "功率因数结论")
    @TableField("cosPj")
    private String cosPj;

    @ApiModelProperty(value = "功率因数参考值")
    @TableField("cosCkz")
    private String cosCkz;


}
