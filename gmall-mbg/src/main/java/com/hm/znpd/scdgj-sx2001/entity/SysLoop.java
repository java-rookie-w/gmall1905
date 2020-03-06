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
 * 回路信息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysLoop对象", description="回路信息")
public class SysLoop implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("distribute_substation_id")
    private Integer distributeSubstationId;

    @TableField("ct")
    private String ct;

    @TableField("type")
    private String type;

    @TableField("rated_current")
    private String ratedCurrent;

    @TableField("yc_ied")
    private String ycIed;

    @TableField("yx_ied")
    private String yxIed;

    @TableField("powersupply_loop")
    private String powersupplyLoop;

    @TableField("switchgear")
    private String switchgear;

    @TableField("collector_addr")
    private String collectorAddr;

    @TableField("switch_num")
    private String switchNum;

    @TableField("item_type")
    private String itemType;

    @TableField("voltage_level")
    private String voltageLevel;

    @TableField("is_important")
    private String isImportant;

    @TableField("rated_capacity")
    private String ratedCapacity;

    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty(value = "电流变比")
    @TableField("electricityCT")
    private String electricityCT;

    @ApiModelProperty(value = "电压变比")
    @TableField("voltageCT")
    private String voltageCT;

    @ApiModelProperty(value = "是否进线回路")
    @TableField("Incoming")
    private String Incoming;


}
