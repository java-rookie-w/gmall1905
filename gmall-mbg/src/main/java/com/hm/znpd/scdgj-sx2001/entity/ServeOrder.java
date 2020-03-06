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
 * 电力服务订单
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ServeOrder对象", description="电力服务订单")
public class ServeOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "订单编号")
    @TableField("num")
    private String num;

    @ApiModelProperty(value = "id")
    @TableField("unit_id")
    private Integer unitId;

    @ApiModelProperty(value = "单位名称")
    @TableField("unit_name")
    private String unitName;

    @ApiModelProperty(value = "联系人")
    @TableField("unit_people")
    private String unitPeople;

    @ApiModelProperty(value = "联系电话")
    @TableField("unit_phone")
    private String unitPhone;

    @ApiModelProperty(value = "地址")
    @TableField("unit_address")
    private String unitAddress;

    @ApiModelProperty(value = "需求内容")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "供应商id")
    @TableField("supplier_id")
    private Integer supplierId;

    @ApiModelProperty(value = "供应商")
    @TableField("supplier_name")
    private String supplierName;

    @ApiModelProperty(value = "供应商联系人")
    @TableField("supplier_people")
    private String supplierPeople;

    @ApiModelProperty(value = "供应商电话")
    @TableField("supplier_phone")
    private String supplierPhone;

    @ApiModelProperty(value = "供应商地址")
    @TableField("supplier_address")
    private String supplierAddress;

    @ApiModelProperty(value = "是否达成")
    @TableField("deal")
    private Integer deal;

    @ApiModelProperty(value = "达成时间")
    @TableField("deal_time")
    private Date dealTime;

    @ApiModelProperty(value = "达成方式")
    @TableField("deal_type")
    private Integer dealType;

    @ApiModelProperty(value = "达成金额")
    @TableField("deal_money")
    private Integer dealMoney;

    @ApiModelProperty(value = "未达成原因")
    @TableField("undeal_reason")
    private String undealReason;

    @ApiModelProperty(value = "集体企业名")
    @TableField("jt_name")
    private String jtName;

    @ApiModelProperty(value = "集体企业联系人")
    @TableField("jt_people")
    private String jtPeople;

    @ApiModelProperty(value = "集体企业电话")
    @TableField("jt_phone")
    private String jtPhone;

    @ApiModelProperty(value = "集体企业地址")
    @TableField("jt_address")
    private String jtAddress;

    @ApiModelProperty(value = "所属区域")
    @TableField("area")
    private Integer area;


}
