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
 * 系统属性表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysPermissions对象", description="系统属性表")
public class SysPermissions implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "权限中文名称")
    @TableField("CNAME")
    private String cname;

    @ApiModelProperty(value = "权限英文名称")
    @TableField("ENAME")
    private String ename;

    @ApiModelProperty(value = "权限类型:菜单，控制点")
    @TableField("PERMISSIONTYPE")
    private Integer permissiontype;

    @ApiModelProperty(value = "模块名称")
    @TableField("MODULENAME")
    private String modulename;

    @ApiModelProperty(value = "是否启用该模块")
    @TableField("ENABLE")
    private Integer enable;

    @ApiModelProperty(value = "父菜单id")
    @TableField("PARENTID")
    private Integer parentid;

    @ApiModelProperty(value = "权限描述")
    @TableField("DESCRIPTION")
    private String description;

    @TableField("URL")
    private String url;

    @TableField("INDEXID")
    private Integer indexid;


}
