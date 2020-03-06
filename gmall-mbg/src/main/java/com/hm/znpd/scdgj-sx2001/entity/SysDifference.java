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
 * 
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysDifference对象", description="")
public class SysDifference implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "巡检报告单公司图片名称")
    @TableField("CHECKREPORTLOGO")
    private String checkreportlogo;

    @ApiModelProperty(value = "巡检报告单公司名称")
    @TableField("CHECKREPORTNAME")
    private String checkreportname;

    @ApiModelProperty(value = "系统logo图片路径")
    @TableField("SYSTEMLOGO")
    private String systemlogo;

    @ApiModelProperty(value = "系统名称")
    @TableField("SYSTEMNAME")
    private String systemname;

    @ApiModelProperty(value = "平台全景链接路径")
    @TableField("homePageurl")
    private String homePageurl;

    @ApiModelProperty(value = "app版本控制 余杭：余杭,杭州：杭州局,绍兴：绍兴")
    @TableField("version_control")
    private String versionControl;

    @ApiModelProperty(value = "巡检报告app名字控制")
    @TableField("plan_raport")
    private String planRaport;


}
