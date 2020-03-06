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
 * 用户电价信息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysElectricity对象", description="用户电价信息")
public class SysElectricity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "时段类型")
    @TableField("timeName")
    private String timeName;

    @ApiModelProperty(value = "设备id")
    @TableField("deviceId")
    private String deviceId;

    @ApiModelProperty(value = "企业id")
    @TableField("orgId")
    private Integer orgId;

    @ApiModelProperty(value = "开始时间")
    @TableField("startTime")
    private String startTime;

    @ApiModelProperty(value = "结束时间")
    @TableField("stopTime")
    private String stopTime;

    @ApiModelProperty(value = "设备名称")
    @TableField("deviceName")
    private String deviceName;

    @ApiModelProperty(value = "配电房id")
    @TableField("subId")
    private String subId;

    @ApiModelProperty(value = "时段电价")
    @TableField("timePrice")
    private String timePrice;


}
