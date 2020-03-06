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
 * 短信模板
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysSmstemplet对象", description="短信模板")
public class SysSmstemplet implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "短信模板编码")
    @TableField("templetCode")
    private String templetCode;

    @ApiModelProperty(value = "短信模板内容")
    @TableField("templetContent")
    private String templetContent;

    @ApiModelProperty(value = "短信模板类型")
    @TableField("templetType")
    private String templetType;

    @ApiModelProperty(value = "发送时间 ")
    @TableField("sendTime")
    private Date sendTime;


}
