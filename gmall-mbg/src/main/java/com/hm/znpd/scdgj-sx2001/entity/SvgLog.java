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
 * SVG 系统操作日志
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SvgLog对象", description="SVG 系统操作日志")
public class SvgLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "记录主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "操作时间")
    @TableField("time")
    private Date time;

    @ApiModelProperty(value = "类型：登录，退出，保存(修改保存，新增保存)")
    @TableField("type")
    private String type;

    @ApiModelProperty(value = "操作人员ID( = svg_user.id )")
    @TableField("operatorId")
    private String operatorId;

    @ApiModelProperty(value = "操作人员名称( = svg_user.name )")
    @TableField("operatorName")
    private String operatorName;

    @ApiModelProperty(value = "内容（关键信息）")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "ip地址")
    @TableField("ip")
    private String ip;

    @ApiModelProperty(value = "计算机名称")
    @TableField("computerName")
    private String computerName;

    @ApiModelProperty(value = "计算机物理地址")
    @TableField("macAddress")
    private String macAddress;

    @ApiModelProperty(value = "操作系统及版本号")
    @TableField("os")
    private String os;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
