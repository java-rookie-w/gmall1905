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
 * 系统属性类别
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysPropertydomains对象", description="系统属性类别")
public class SysPropertydomains implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "领域的属性名称")
    @TableField("DOMAINNAME")
    private String domainname;

    @ApiModelProperty(value = "系统敏感，是否具有系统内置属性")
    @TableField("SYSTEMSENSITIVE")
    private Integer systemsensitive;

    @ApiModelProperty(value = "系统约束")
    @TableField("SYSTEMRESTRICT")
    private String systemrestrict;


}
