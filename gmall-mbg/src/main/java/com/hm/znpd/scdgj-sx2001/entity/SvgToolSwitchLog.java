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
 * 开关操作日志
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SvgToolSwitchLog对象", description="开关操作日志")
public class SvgToolSwitchLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "企业id")
    @TableField("customer_id")
    private Long customerId;

    @ApiModelProperty(value = "站房id")
    @TableField("station_id")
    private Long stationId;

    @ApiModelProperty(value = "回路id")
    @TableField("device_id")
    private Long deviceId;

    @ApiModelProperty(value = "回路名称")
    @TableField("device_text")
    private String deviceText;

    @ApiModelProperty(value = "操作人id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty(value = "操作人名称")
    @TableField("user_text")
    private String userText;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "操作过程")
    @TableField("oper_log")
    private String operLog;

    @ApiModelProperty(value = "操作过程描述")
    @TableField("oper_log_text")
    private String operLogText;

    @ApiModelProperty(value = "当前状态值")
    @TableField("current_value")
    private String currentValue;

    @ApiModelProperty(value = "操作口令")
    @TableField("oper_token")
    private String operToken;

    @ApiModelProperty(value = "当前状态值描述")
    @TableField("current_value_text")
    private String currentValueText;

    @ApiModelProperty(value = "界面属性名称")
    @TableField("property_key")
    private String propertyKey;

    @ApiModelProperty(value = "跳闸类型（手动，自动）")
    @TableField("type")
    private String type;

    @ApiModelProperty(value = "告警事件id( = alm_alarm_data.id  )")
    @TableField("alarmId")
    private String alarmId;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty(value = "正式遥控1模拟遥控0")
    @TableField("state")
    private Integer state;

    @ApiModelProperty(value = "发送消息")
    @TableField("pub_text")
    private String pubText;

    @ApiModelProperty(value = "接收消息")
    @TableField("rec_text")
    private String recText;

    @ApiModelProperty(value = "最近一次更新时间")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "设备网络地址")
    @TableField("device_mac")
    private String deviceMac;

    @ApiModelProperty(value = "设备通信地址")
    @TableField("device_addr")
    private String deviceAddr;


}
