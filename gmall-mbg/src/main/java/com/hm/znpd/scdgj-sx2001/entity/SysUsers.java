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
 * 人员信息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysUsers对象", description="人员信息")
public class SysUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属部门ID")
    @TableField("ORGANIZATIONID")
    private Integer organizationid;

    @ApiModelProperty(value = "所属部门内置类型码")
    @TableField("ORGINTERNALCODE")
    private String orginternalcode;

    @ApiModelProperty(value = "记录用户登录失败次数")
    @TableField("FAILURETIMES")
    private Integer failuretimes;

    @ApiModelProperty(value = "是否锁定")
    @TableField("ISLOCK")
    private Integer islock;

    @ApiModelProperty(value = "是否超级管理员")
    @TableField("ISADMIN")
    private Integer isadmin;

    @ApiModelProperty(value = "是否普通用户（填写申请单）")
    @TableField("ISNORMAL")
    private Integer isnormal;

    @ApiModelProperty(value = "登录时需要修改密码(默认不)")
    @TableField("CHANGEPASSWORD")
    private Integer changepassword;

    @ApiModelProperty(value = "用户系统登陆账号")
    @TableField("LOGINNAME")
    private String loginname;

    @ApiModelProperty(value = "用户名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "密码")
    @TableField("PASSWORD")
    private String password;

    @ApiModelProperty(value = "手机号码")
    @TableField("MOBILE")
    private String mobile;

    @ApiModelProperty(value = "工号")
    @TableField("WORKNO")
    private String workno;

    @ApiModelProperty(value = "姓名全拼")
    @TableField("FULLPINYIN")
    private String fullpinyin;

    @ApiModelProperty(value = "姓名简拼")
    @TableField("SIMPLEPINYIN")
    private String simplepinyin;

    @ApiModelProperty(value = "电子邮件")
    @TableField("EMAIL")
    private String email;

    @ApiModelProperty(value = " 工作电话")
    @TableField("WORKPHONE")
    private String workphone;

    @ApiModelProperty(value = "创建用户名")
    @TableField("CREATEUSER")
    private String createuser;

    @ApiModelProperty(value = "创建日期")
    @TableField("CREATEDATE")
    private Date createdate;

    @ApiModelProperty(value = "最后更新用户名")
    @TableField("UPDATEUSER")
    private String updateuser;

    @ApiModelProperty(value = "最后更新日期")
    @TableField("UPDATEDATE")
    private Date updatedate;

    @ApiModelProperty(value = "运维企业运维经理")
    @TableField("ISMANAGER")
    private Integer ismanager;

    @ApiModelProperty(value = "所属部门")
    @TableField("department")
    private Integer department;

    @ApiModelProperty(value = "手势码")
    @TableField("LOCKCODE")
    private String lockcode;

    @ApiModelProperty(value = "是否有效")
    @TableField("flag")
    private Integer flag;

    @ApiModelProperty(value = "用户管辖区域")
    @TableField("manage_area")
    private String manageArea;

    @ApiModelProperty(value = "密码失效日期")
    @TableField("invalidate")
    private Date invalidate;

    @ApiModelProperty(value = "用户所属区域")
    @TableField("AREA")
    private String area;

    @ApiModelProperty(value = "PASSWORD2")
    @TableField("PASSWORD2")
    private String password2;

    @ApiModelProperty(value = "绑定的微信号openid")
    @TableField("WXOPENID")
    private String wxopenid;


}
