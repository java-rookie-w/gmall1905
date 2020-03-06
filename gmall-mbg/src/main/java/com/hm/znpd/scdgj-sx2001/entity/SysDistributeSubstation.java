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
 * 分布式配电房
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysDistributeSubstation对象", description="分布式配电房")
public class SysDistributeSubstation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "变压器总数量（台）")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "总容量(kVA)")
    @TableField("capacity")
    private Integer capacity;

    @ApiModelProperty(value = "配电房类型【字典表】")
    @TableField("type")
    private String type;

    @ApiModelProperty(value = "巡视类型（配电房, 电缆, 架空线）")
    @TableField("patrolling_type")
    private String patrollingType;

    @ApiModelProperty(value = "配电房状态【字典表】")
    @TableField("status")
    private String status;

    @ApiModelProperty(value = "地址")
    @TableField("addr")
    private String addr;

    @ApiModelProperty(value = "设备ID( = bsd_device.id )")
    @TableField("deviceid")
    private Integer deviceid;

    @ApiModelProperty(value = "电压等级【字典表】")
    @TableField("voltage_level")
    private Integer voltageLevel;

    @ApiModelProperty(value = "运行变压器(台)")
    @TableField("operating_transformers")
    private String operatingTransformers;

    @ApiModelProperty(value = "运行容量（kVA）")
    @TableField("operating_capacity")
    private String operatingCapacity;


}
