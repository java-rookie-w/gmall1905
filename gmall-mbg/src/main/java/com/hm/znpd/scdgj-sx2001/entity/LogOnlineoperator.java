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
 * 用户在线日志
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="LogOnlineoperator对象", description="用户在线日志")
public class LogOnlineoperator implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "操作人id")
    @TableField("oprtid")
    private String oprtid;

    @ApiModelProperty(value = "操作人")
    @TableField("oprtname")
    private String oprtname;

    @ApiModelProperty(value = "部门编号")
    @TableField("deptid")
    private String deptid;

    @ApiModelProperty(value = "部门")
    @TableField("deptname")
    private String deptname;

    @TableField("sessionid")
    private String sessionid;

    @ApiModelProperty(value = "ip地址")
    @TableField("ip")
    private String ip;

    @ApiModelProperty(value = "计算机名称")
    @TableField("computername")
    private String computername;

    @ApiModelProperty(value = "进入系统时间")
    @TableField("logintime")
    private Date logintime;

    @ApiModelProperty(value = "退出系统时间")
    @TableField("logoutime")
    private Date logoutime;

    @ApiModelProperty(value = "计算机物理地址")
    @TableField("macaddress")
    private String macaddress;

    @ApiModelProperty(value = "操作系统及版本号")
    @TableField("os")
    private String os;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
