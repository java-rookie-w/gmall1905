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
 * 用户session表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysUsersessions对象", description="用户session表")
public class SysUsersessions implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "32位uuid")
    @TableField("SESSIONID")
    private String sessionid;

    @ApiModelProperty(value = "用户id")
    @TableField("USERID")
    private Integer userid;

    @ApiModelProperty(value = "用户登录名")
    @TableField("LOGINNAME")
    private String loginname;

    @ApiModelProperty(value = "用户姓名")
    @TableField("USERREALNAME")
    private String userrealname;

    @ApiModelProperty(value = "所属部门ID")
    @TableField("ORGID")
    private Integer orgid;

    @ApiModelProperty(value = "最后访问ip")
    @TableField("ACCESSIP")
    private String accessip;

    @ApiModelProperty(value = "最后访问时间")
    @TableField("ACCESSTIME")
    private Date accesstime;

    @ApiModelProperty(value = "是否登录")
    @TableField("ISLOGIN")
    private Integer islogin;

    @TableField("LOGINDATE")
    private Date logindate;

    @ApiModelProperty(value = " 最后访问请求")
    @TableField("LASTURL")
    private String lasturl;

    @ApiModelProperty(value = "登录IP")
    @TableField("LOGINIP")
    private String loginip;

    @ApiModelProperty(value = "验证码")
    @TableField("VALIDATECODE")
    private String validatecode;

    @ApiModelProperty(value = "所属部门内置类型码")
    @TableField("ORGINTERNALCODE")
    private String orginternalcode;


}
