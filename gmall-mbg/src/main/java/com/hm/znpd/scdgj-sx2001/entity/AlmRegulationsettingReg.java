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
 * 告警规则设置注册
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AlmRegulationsettingReg对象", description="告警规则设置注册")
public class AlmRegulationsettingReg implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "符号")
    @TableField("symbol")
    private String symbol;

    @ApiModelProperty(value = "数值")
    @TableField("value")
    private String value;

    @ApiModelProperty(value = "额定值")
    @TableField("definitevalue")
    private Integer definitevalue;

    @ApiModelProperty(value = "alm_regulationsetting表id")
    @TableField("rid")
    private Integer rid;

    @TableField("typeid")
    private Integer typeid;


}
