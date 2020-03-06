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
 * SVG图模平台远程控制操作用户（按人员配置显示操作人，监护人）
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SvgUser对象", description="SVG图模平台远程控制操作用户（按人员配置显示操作人，监护人）")
public class SvgUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "表记录主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "人员类型（1-操作人，2-监护人,3-系统配置员,4-绘图员）")
    @TableField("type")
    private String type;

    @ApiModelProperty(value = "用户ID = sys_users.id")
    @TableField("userId")
    private String userId;

    @ApiModelProperty(value = "用户账号 = sys_user.loginname")
    @TableField("loginName")
    private String loginName;

    @ApiModelProperty(value = "用户名称 = sys_user.name")
    @TableField("userName")
    private String userName;

    @ApiModelProperty(value = "用户操作口令（加密）= sys_user.password")
    @TableField("userPassword")
    private String userPassword;

    @ApiModelProperty(value = "角色id")
    @TableField("roleId")
    private String roleId;

    @ApiModelProperty(value = "角色名称")
    @TableField("roleName")
    private String roleName;

    @ApiModelProperty(value = "启用标志（1-启用，0-停用）")
    @TableField("flag")
    private String flag;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
