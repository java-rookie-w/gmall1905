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
 * 公司信息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysCompanyInfo对象", description="公司信息")
public class SysCompanyInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("abbreviation")
    private String abbreviation;

    @TableField("city")
    private String city;

    @TableField("contract_capacity")
    private String contractCapacity;

    @TableField("operating_capacity")
    private String operatingCapacity;

    @TableField("household_num")
    private String householdNum;

    @TableField("voltage_level")
    private String voltageLevel;

    @TableField("addr")
    private String addr;

    @TableField("power_manager")
    private String powerManager;

    @TableField("power_head")
    private String powerHead;

    @TableField("manager_phone")
    private String managerPhone;

    @TableField("head_phone")
    private String headPhone;

    @TableField("annexes")
    private String annexes;


}
