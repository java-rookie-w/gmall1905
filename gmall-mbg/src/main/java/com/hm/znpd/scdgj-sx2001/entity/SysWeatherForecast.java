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
 * 天气预报
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysWeatherForecast对象", description="天气预报")
public class SysWeatherForecast implements Serializable {

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

    @ApiModelProperty(value = "白天天气状况代码")
    @TableField("cond_code_d")
    private String condCodeD;

    @ApiModelProperty(value = "晚间天气状况代码")
    @TableField("cond_code_n")
    private String condCodeN;

    @ApiModelProperty(value = "白天天气状况描述")
    @TableField("cond_txt_d")
    private String condTxtD;

    @ApiModelProperty(value = "晚间天气状况描述")
    @TableField("cond_txt_n")
    private String condTxtN;

    @ApiModelProperty(value = "预报日期")
    @TableField("date")
    private Date date;

    @ApiModelProperty(value = "相对湿度")
    @TableField("hum")
    private String hum;

    @ApiModelProperty(value = "月升时间")
    @TableField("mr")
    private String mr;

    @ApiModelProperty(value = "月落时间")
    @TableField("ms")
    private String ms;

    @ApiModelProperty(value = "降水量")
    @TableField("pcpn")
    private String pcpn;

    @ApiModelProperty(value = "降水概率")
    @TableField("pop")
    private String pop;

    @ApiModelProperty(value = "大气压强")
    @TableField("pres")
    private String pres;

    @ApiModelProperty(value = "日出时间")
    @TableField("sr")
    private String sr;

    @ApiModelProperty(value = "日落时间")
    @TableField("ss")
    private String ss;

    @ApiModelProperty(value = "最高温度")
    @TableField("tmp_max")
    private String tmpMax;

    @ApiModelProperty(value = "最低温度")
    @TableField("tmp_min")
    private String tmpMin;

    @ApiModelProperty(value = "紫外线强度指数")
    @TableField("uv_index")
    private String uvIndex;

    @ApiModelProperty(value = "能见度，单位：公里")
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
