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
 * 配电房图形
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysDiagram对象", description="配电房图形")
public class SysDiagram implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "柜体名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "柜体或表计ID可多个")
    @TableField("device_ids")
    private String deviceIds;

    @ApiModelProperty(value = "柜体图形id")
    @TableField("cabinet_id")
    private Integer cabinetId;

    @ApiModelProperty(value = "柜体类型")
    @TableField("cabinet_code")
    private String cabinetCode;

    @ApiModelProperty(value = "x坐标")
    @TableField("point_x")
    private Integer pointX;

    @ApiModelProperty(value = "y坐标")
    @TableField("point_y")
    private Integer pointY;

    @ApiModelProperty(value = "宽度")
    @TableField("width")
    private Integer width;

    @ApiModelProperty(value = "前驱柜id")
    @TableField("backward_id")
    private Long backwardId;

    @ApiModelProperty(value = "后继柜id")
    @TableField("forward_id")
    private Long forwardId;

    @ApiModelProperty(value = "联络柜id")
    @TableField("link_id")
    private Long linkId;

    @ApiModelProperty(value = "柜内供电方式(lr rl all)")
    @TableField("supply_type")
    private String supplyType;

    @ApiModelProperty(value = "企业id")
    @TableField("customer_id")
    private Long customerId;

    @ApiModelProperty(value = "配电房id")
    @TableField("sub_station_id")
    private Long subStationId;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "最近一次更新时间")
    @TableField("update_time")
    private Date updateTime;


}
