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
 * SVG图模平台远程控制操作设备或配电房
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SvgDevice对象", description="SVG图模平台远程控制操作设备或配电房")
public class SvgDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "表记录主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "设备控制类型（1-配电房，2-开关设备）")
    @TableField("type")
    private String type;

    @ApiModelProperty(value = "设备id")
    @TableField("deviceId")
    private String deviceId;

    @ApiModelProperty(value = "设备名称")
    @TableField("deviceName")
    private String deviceName;

    @ApiModelProperty(value = "配电房id")
    @TableField("subStationId")
    private String subStationId;

    @ApiModelProperty(value = "配电房名称")
    @TableField("subStationName")
    private String subStationName;

    @ApiModelProperty(value = "企业ID")
    @TableField("customerId")
    private String customerId;

    @ApiModelProperty(value = "企业名称")
    @TableField("customerName")
    private String customerName;

    @ApiModelProperty(value = "启用标志（1-启用，0-停用）")
    @TableField("flag")
    private String flag;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
