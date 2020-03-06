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
 * 
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysOnlineoperator对象", description="")
public class SysOnlineoperator implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("ID")
    private Integer id;

    @ApiModelProperty(value = "操作人id")
    @TableField("OPRTID")
    private Integer oprtid;

    @ApiModelProperty(value = "用户名")
    @TableField("OPRTNAME")
    private String oprtname;

    @ApiModelProperty(value = "ip地址")
    @TableField("IP")
    private String ip;

    @ApiModelProperty(value = "计算机名称")
    @TableField("COMPUTERNAME")
    private String computername;

    @ApiModelProperty(value = "进入系统时间")
    @TableField("LOGINTIME")
    private Date logintime;

    @ApiModelProperty(value = "退出系统时间")
    @TableField("LOGOUTTIME")
    private Date logouttime;

    @ApiModelProperty(value = "会话id")
    @TableField("SESSIONID")
    private String sessionid;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "计算机物理地址")
    @TableField("MACADDRESS")
    private String macaddress;

    @ApiModelProperty(value = "操作系统及版本号")
    @TableField("OS")
    private String os;

    @ApiModelProperty(value = "部门")
    @TableField("DEPTNAME")
    private String deptname;

    @ApiModelProperty(value = "部门编号")
    @TableField("DEPTID")
    private String deptid;

    @ApiModelProperty(value = "是否成功登陆")
    @TableField("ISSUCCESS")
    private Integer issuccess;


}
