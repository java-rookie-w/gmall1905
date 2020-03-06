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
 * 角色信息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysRoles对象", description="角色信息")
public class SysRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "角色名称")
    @TableField("ROLENAME")
    private String rolename;

    @ApiModelProperty(value = "描述")
    @TableField("DESCRIPTION")
    private String description;

    @ApiModelProperty(value = "创建的用户名")
    @TableField("CREATEUSER")
    private String createuser;

    @ApiModelProperty(value = "创建日期")
    @TableField("CREATEDATE")
    private Date createdate;

    @ApiModelProperty(value = "最后更新时间 ")
    @TableField("UPDATEDATE")
    private Date updatedate;

    @ApiModelProperty(value = "最后更新用户名")
    @TableField("UPDATEUSER")
    private String updateuser;


}
