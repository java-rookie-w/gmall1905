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
 * 技术推广服务报价
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ServePromotion对象", description="技术推广服务报价")
public class ServePromotion implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "区域名称")
    @TableField("area_name")
    private String areaName;

    @ApiModelProperty(value = "区域")
    @TableField("area")
    private Integer area;

    @ApiModelProperty(value = "服务名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "服务类型")
    @TableField("serve_type")
    private Integer serveType;

    @ApiModelProperty(value = "服务价")
    @TableField("price")
    private Integer price;


}
