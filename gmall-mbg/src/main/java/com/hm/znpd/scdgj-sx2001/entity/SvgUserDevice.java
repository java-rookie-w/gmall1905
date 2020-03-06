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
 * SVG图模平台远程控制用户操作设备
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SvgUserDevice对象", description="SVG图模平台远程控制用户操作设备")
public class SvgUserDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "表记录主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户ID（人员ID-配电房id , 人员ID -设备id ）人员控制配电房或设备")
    @TableField("userId")
    private String userId;

    @ApiModelProperty(value = "用户名称")
    @TableField("userName")
    private String userName;

    @ApiModelProperty(value = "角色ID（角色ID-配电房id , 角色ID -设备id ）角色控制配电房或设备")
    @TableField("roleId")
    private String roleId;

    @ApiModelProperty(value = "角色名称")
    @TableField("roleName")
    private String roleName;

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
