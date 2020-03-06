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
 * 画图工具数据保存
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SvgToolData对象", description="画图工具数据保存")
public class SvgToolData implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "图形代码")
    @TableField("code")
    private String code;

    @ApiModelProperty(value = "图形名称")
    @TableField("text")
    private String text;

    @ApiModelProperty(value = "svg图文件")
    @TableField("svg")
    private String svg;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "版本")
    @TableField("version")
    private String version;

    @ApiModelProperty(value = "图片文件")
    @TableField("img")
    private String img;

    @ApiModelProperty(value = "图元类型")
    @TableField("symbol_type")
    private String symbolType;

    @ApiModelProperty(value = "高压侧电压等级")
    @TableField("high_voltage")
    private String highVoltage;

    @ApiModelProperty(value = "低压侧电压等级")
    @TableField("low_voltage")
    private String lowVoltage;

    @ApiModelProperty(value = "企业id（= sys_organizations.id ）")
    @TableField("customer_id")
    private Long customerId;

    @ApiModelProperty(value = "配电房id（= bsd_device.id and bsd_device.device_type_id =1 ）")
    @TableField("station_id")
    private Long stationId;

    @ApiModelProperty(value = "状态(1为正式发布, 0- 设计态， 其他为编辑 )")
    @TableField("state")
    private Integer state;


}
