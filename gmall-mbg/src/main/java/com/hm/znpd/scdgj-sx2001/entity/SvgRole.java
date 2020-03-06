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
 * SVG图模平台远程控制操作角色（按角色显示人员）
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SvgRole对象", description="SVG图模平台远程控制操作角色（按角色显示人员）")
public class SvgRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "表记录主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "角色人员类型（1-操作人，2-监护人）")
    @TableField("type")
    private String type;

    @ApiModelProperty(value = "角色id= sys_roles.id")
    @TableField("roleId")
    private String roleId;

    @ApiModelProperty(value = "角色名称 = sys_roles.rolename")
    @TableField("roleName")
    private String roleName;

    @ApiModelProperty(value = "启用标志（1-启用，0-停用）")
    @TableField("flag")
    private String flag;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
