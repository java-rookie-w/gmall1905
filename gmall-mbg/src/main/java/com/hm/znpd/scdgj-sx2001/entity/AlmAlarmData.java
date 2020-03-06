package com.hm.znpd.scdgj-sx2001.entity;

import java.math.BigDecimal;
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
 * 告警事件
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AlmAlarmData对象", description="告警事件")
public class AlmAlarmData implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "设备id（= bsd_device.id ）")
    @TableField("device_id")
    private Integer deviceId;

    @ApiModelProperty(value = "测量点id ( = bsd_meas_point.id)")
    @TableField("meas_point_id")
    private Integer measPointId;

    @ApiModelProperty(value = "告警类型id (= alm_alarm_type.id )")
    @TableField("alarm_type_id")
    private Integer alarmTypeId;

    @ApiModelProperty(value = "内容")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "报警值")
    @TableField("alarm_value")
    private BigDecimal alarmValue;

    @ApiModelProperty(value = "0表示 当前告警正在发生  1表示当前告警已经结束")
    @TableField("status")
    private String status;

    @ApiModelProperty(value = "发生时间")
    @TableField("begin_time")
    private Date beginTime;

    @ApiModelProperty(value = "结束时间")
    @TableField("end_time")
    private Date endTime;

    @ApiModelProperty(value = "是否确认按钮0 代表未确认 ，1代表已经确认")
    @TableField("cfm_flag")
    private String cfmFlag;

    @ApiModelProperty(value = "企业id(=sys_organizations.id )")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = "rdp_no 对应 bsd_device 表的 rdp_no  代表的是前置机是序号")
    @TableField("rdp_no")
    private String rdpNo;

    @ApiModelProperty(value = "device_addr 对应 bsd_device 表的 device_addr代表的是地址")
    @TableField("device_addr")
    private String deviceAddr;

    @ApiModelProperty(value = "删除标记")
    @TableField("del_flag")
    private String delFlag;

    @ApiModelProperty(value = "类型 0表示 遥测越限遥信变位告警  1表示通讯中断告警")
    @TableField("type")
    private String type;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "状态严重等级：0一般，1重大，2紧急 [ 与alm_event_set.code 有关联 ]")
    @TableField("Segrade")
    private Integer Segrade;

    @ApiModelProperty(value = "短信状态  0 ：未发送，1：已发送")
    @TableField("smsStatus")
    private Integer smsStatus;

    @ApiModelProperty(value = "手机号码")
    @TableField("mobiel")
    private String mobiel;

    @ApiModelProperty(value = "短信接收人")
    @TableField("recipient")
    private String recipient;


}
