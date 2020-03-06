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
 * 策略表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysTaskploy对象", description="策略表")
public class SysTaskploy implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "策略中文名称")
    @TableField("CNAME")
    private String cname;

    @ApiModelProperty(value = "策略英文名称")
    @TableField("ENAME")
    private String ename;

    @ApiModelProperty(value = "策略类型")
    @TableField("TYPE")
    private Integer type;

    @ApiModelProperty(value = "策略描述")
    @TableField("DESCRIPTION")
    private String description;

    @ApiModelProperty(value = "策略代码")
    @TableField("CODE")
    private String code;


}
