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
 * 供应商
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ServeSupplier对象", description="供应商")
public class ServeSupplier implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "供应商")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "供应商联系人")
    @TableField("people")
    private String people;

    @ApiModelProperty(value = "供应商电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "供应商地址")
    @TableField("address")
    private String address;

    @ApiModelProperty(value = "服务区域")
    @TableField("area")
    private Integer area;

    @ApiModelProperty(value = "服务类型")
    @TableField("serve_type")
    private Integer serveType;

    @ApiModelProperty(value = "资质")
    @TableField("qualification")
    private String qualification;

    @ApiModelProperty(value = "业务")
    @TableField("business")
    private String business;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "供应商图片")
    @TableField("image")
    private String image;

    @ApiModelProperty(value = "单位典型项目")
    @TableField("typical_unit_projects")
    private String typicalUnitProjects;

    @ApiModelProperty(value = "收费标准")
    @TableField("charging_standard")
    private String chargingStandard;


}
