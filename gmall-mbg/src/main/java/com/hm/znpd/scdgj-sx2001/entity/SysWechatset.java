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
 * 微信设置
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysWechatset对象", description="微信设置")
public class SysWechatset implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "企业微信唯一标识")
    @TableField("CORPID")
    private String corpid;

    @ApiModelProperty(value = "企业应用的AgentId")
    @TableField("AGENTID")
    private Integer agentid;

    @ApiModelProperty(value = "管理组的凭证密钥，每个secret代表了对应用、通讯录、接口的不同权限；不同的管理组拥有不同的secret")
    @TableField("SECRET")
    private String secret;

    @ApiModelProperty(value = "服务器主域名")
    @TableField("URL")
    private String url;

    @ApiModelProperty(value = "微信公众号后台配置token和这里必须保持一致")
    @TableField("TOKEN")
    private String token;

    @ApiModelProperty(value = "微信公众号后台配置加密密钥和这里必须保持一致")
    @TableField("ENCODINGAESKEY")
    private String encodingaeskey;

    @ApiModelProperty(value = "添加用户和部门同步到微信，默认 0 不同步， 1 同步")
    @TableField("SYNCWECHAT")
    private Integer syncwechat;


}
