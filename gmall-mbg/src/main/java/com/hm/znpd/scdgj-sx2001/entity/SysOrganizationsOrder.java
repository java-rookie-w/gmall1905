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
 * 
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysOrganizationsOrder对象", description="")
public class SysOrganizationsOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户id")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = "甲方邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty(value = "发票类型")
    @TableField("invoice_type")
    private String invoiceType;

    @ApiModelProperty(value = "合同类型")
    @TableField("contract_type")
    private String contractType;

    @ApiModelProperty(value = "合同期限")
    @TableField("contract_term")
    private String contractTerm;

    @ApiModelProperty(value = "终端数目")
    @TableField("terminal")
    private String terminal;

    @ApiModelProperty(value = "合同总金额")
    @TableField("Total_sum")
    private String totalSum;

    @ApiModelProperty(value = "收费标准")
    @TableField("Charging_standard")
    private String chargingStandard;

    @ApiModelProperty(value = "流程状态(0-审核被驳回，null-用电企业(第一次填写为null)，1-运维公司生成负责人，2-运维公司负责领导，3-待付款,4-付款成功)")
    @TableField("flag")
    private String flag;

    @ApiModelProperty(value = "驳回原因")
    @TableField("remark")
    private String remark;

    @ApiModelProperty(value = "订单生成时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "订单支付成功时间")
    @TableField("end_time")
    private Date endTime;

    @ApiModelProperty(value = "创建人")
    @TableField("create_name")
    private String createName;

    @ApiModelProperty(value = "开户银行")
    @TableField("deposit_bank")
    private String depositBank;

    @ApiModelProperty(value = "账户")
    @TableField("account")
    private String account;

    @ApiModelProperty(value = "税号")
    @TableField("duty_paragraph")
    private String dutyParagraph;

    @ApiModelProperty(value = "增值税率")
    @TableField("tax_rate")
    private String taxRate;

    @ApiModelProperty(value = "合同路径")
    @TableField("path")
    private String path;

    @ApiModelProperty(value = "合同")
    @TableField("contractname")
    private String contractname;


}
