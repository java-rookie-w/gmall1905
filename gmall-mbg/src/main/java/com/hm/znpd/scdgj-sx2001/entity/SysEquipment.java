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
 * 基础信息-设备信息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysEquipment对象", description="基础信息-设备信息")
public class SysEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "设备名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "设备类型(字典表)")
    @TableField("type")
    private Integer type;

    @ApiModelProperty(value = "型号")
    @TableField("model")
    private String model;

    @ApiModelProperty(value = "电压等级（字典表）")
    @TableField("voltage_level")
    private Integer voltageLevel;

    @ApiModelProperty(value = "出厂日期")
    @TableField("date_of_production")
    private Date dateOfProduction;

    @ApiModelProperty(value = "投运日期")
    @TableField("run_date")
    private Date runDate;

    @ApiModelProperty(value = "运行状态(字典表）")
    @TableField("running_state")
    private Integer runningState;

    @ApiModelProperty(value = "制造厂商")
    @TableField("manufacturer")
    private String manufacturer;

    @ApiModelProperty(value = "所属配电房ID")
    @TableField("substation_id")
    private Integer substationId;

    @ApiModelProperty(value = "所属电力柜ID")
    @TableField("electric_cab")
    private Integer electricCab;

    @ApiModelProperty(value = "用电企业ID")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = " 资产归属")
    @TableField("asset_owner")
    private String assetOwner;

    @ApiModelProperty(value = "创建日期")
    @TableField("create_date")
    private Date createDate;

    @ApiModelProperty(value = "创建人")
    @TableField("create_user_id")
    private Integer createUserId;


}
