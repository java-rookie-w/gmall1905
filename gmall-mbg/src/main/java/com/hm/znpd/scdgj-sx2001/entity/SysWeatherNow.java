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
 * 实时天气缓存表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysWeatherNow对象", description="实时天气缓存表")
public class SysWeatherNow implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "城市ID")
    @TableField("cityId")
    private Integer cityId;

    @ApiModelProperty(value = " 更新时间")
    @TableField("updateTime")
    private Date updateTime;

    @ApiModelProperty(value = "云量")
    @TableField("cloud")
    private String cloud;

    @ApiModelProperty(value = "实况天气状况代码")
    @TableField("cond_code")
    private String condCode;

    @ApiModelProperty(value = "实况天气状况描述")
    @TableField("cond_txt")
    private String condTxt;

    @ApiModelProperty(value = "体感温度，默认单位：摄氏度")
    @TableField("fl")
    private String fl;

    @ApiModelProperty(value = "相对湿度")
    @TableField("hum")
    private String hum;

    @ApiModelProperty(value = "降水量")
    @TableField("pcpn")
    private String pcpn;

    @ApiModelProperty(value = "大气压强")
    @TableField("pres")
    private String pres;

    @ApiModelProperty(value = "温度，默认单位：摄氏度")
    @TableField("tmp")
    private String tmp;

    @ApiModelProperty(value = "能见度，默认单位：公里")
    @TableField("vis")
    private String vis;

    @ApiModelProperty(value = "风向360角度")
    @TableField("wind_deg")
    private String windDeg;

    @ApiModelProperty(value = "风向")
    @TableField("wind_dir")
    private String windDir;

    @ApiModelProperty(value = "风力")
    @TableField("wind_sc")
    private String windSc;

    @ApiModelProperty(value = "风速，公里/小时")
    @TableField("wind_spd")
    private String windSpd;


}
