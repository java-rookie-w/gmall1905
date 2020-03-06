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
 * 告警规则设置
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AlmRegulationsetting对象", description="告警规则设置")
public class AlmRegulationsetting implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "规则名称")
    @TableField("regulationname")
    private String regulationname;

    @ApiModelProperty(value = "规则类型")
    @TableField("regulationtype")
    private String regulationtype;

    @ApiModelProperty(value = "持续时间")
    @TableField("continuedtime")
    private Integer continuedtime;

    @ApiModelProperty(value = "间隔时间")
    @TableField("intervaltime")
    private Integer intervaltime;

    @ApiModelProperty(value = "创建时间")
    @TableField("createtime")
    private Date createtime;

    @ApiModelProperty(value = "状态")
    @TableField("state")
    private Integer state;

    @ApiModelProperty(value = "创建人")
    @TableField("createuser")
    private String createuser;

    @ApiModelProperty(value = "逻辑规则")
    @TableField("logicrules")
    private String logicrules;

    @ApiModelProperty(value = "符号")
    @TableField("symbol")
    private String symbol;

    @ApiModelProperty(value = "数值")
    @TableField("value")
    private String value;

    @ApiModelProperty(value = "额定值")
    @TableField("definitevalue")
    private String definitevalue;

    @ApiModelProperty(value = "所属于用户id")
    @TableField("customer_id")
    private String customerId;

    @ApiModelProperty(value = "所属用户")
    @TableField("customer_name")
    private String customerName;


}
