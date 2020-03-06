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
 * 供应商厂家
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="BsdVandor对象", description="供应商厂家")
public class BsdVandor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "厂家简称")
    @TableField("short_name")
    private String shortName;

    @ApiModelProperty(value = "厂家全称")
    @TableField("long_name")
    private String longName;

    @ApiModelProperty(value = "地址")
    @TableField("address")
    private String address;

    @ApiModelProperty(value = "联系人")
    @TableField("linkman")
    private String linkman;

    @ApiModelProperty(value = "联系电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "默认设备的用户名")
    @TableField("user")
    private String user;

    @ApiModelProperty(value = "默认设备的密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "默认端口")
    @TableField("port")
    private Integer port;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    @TableField("customer_id")
    private Integer customerId;


}
