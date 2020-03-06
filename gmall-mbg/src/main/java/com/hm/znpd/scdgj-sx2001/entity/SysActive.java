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
 * 软件注册登记
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysActive对象", description="软件注册登记")
public class SysActive implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "最大用户数")
    @TableField("USERNUM")
    private Integer usernum;

    @ApiModelProperty(value = "服务截止日期")
    @TableField("OVERTIME")
    private Date overtime;

    @ApiModelProperty(value = "服务器ID")
    @TableField("SYSTEMID")
    private String systemid;

    @ApiModelProperty(value = "系统版本号")
    @TableField("VERSION")
    private String version;

    @ApiModelProperty(value = "激活码")
    @TableField("ACTIVECODE")
    private String activecode;

    @ApiModelProperty(value = "密钥地址")
    @TableField("PUBLICKEY")
    private String publickey;

    @ApiModelProperty(value = "激活状态")
    @TableField("STATUS")
    private Integer status;


}
