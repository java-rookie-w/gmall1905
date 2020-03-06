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
 * 用户评价统计
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysUserpjstatistics对象", description="用户评价统计")
public class SysUserpjstatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "评价统计页面表id")
    @TableField("statisticsNameId")
    private Integer statisticsNameId;

    @ApiModelProperty(value = "统计日期")
    @TableField("statisticsTime")
    private String statisticsTime;

    @ApiModelProperty(value = "用户Id")
    @TableField("userId")
    private String userId;

    @ApiModelProperty(value = "排名")
    @TableField("ranking")
    private String ranking;

    @ApiModelProperty(value = "工单总数")
    @TableField("gdSum")
    private String gdSum;

    @ApiModelProperty(value = "评价率")
    @TableField("pjrate")
    private String pjrate;

    @ApiModelProperty(value = "五星好评率")
    @TableField("fiveStarsRate")
    private String fiveStarsRate;

    @ApiModelProperty(value = "差评次数")
    @TableField("timesSum")
    private String timesSum;

    @ApiModelProperty(value = "及时性五星好评率")
    @TableField("timelinessFiveStarsRate")
    private String timelinessFiveStarsRate;

    @ApiModelProperty(value = "及时性差评次数")
    @TableField("timelinessTimesSum")
    private String timelinessTimesSum;

    @ApiModelProperty(value = "服务态度五星好评率")
    @TableField("serviceStarFiveStarsRate")
    private String serviceStarFiveStarsRate;

    @ApiModelProperty(value = "服务态度差评次数")
    @TableField("serviceStarTimesSum")
    private String serviceStarTimesSum;

    @ApiModelProperty(value = "技能水平五星好评率")
    @TableField("skillStarFiveStarsRate")
    private String skillStarFiveStarsRate;

    @ApiModelProperty(value = "技能水平差评次数")
    @TableField("skillStarTimesSum")
    private String skillStarTimesSum;

    @ApiModelProperty(value = "服务质量五星好评率")
    @TableField("serviceQualityFiveStarsRate")
    private String serviceQualityFiveStarsRate;

    @ApiModelProperty(value = "服务质量差评次数")
    @TableField("serviceQualityTimesSum")
    private String serviceQualityTimesSum;


}
