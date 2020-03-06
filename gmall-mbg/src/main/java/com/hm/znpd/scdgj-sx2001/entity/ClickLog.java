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
 * 用户点击模块界面内容日志
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ClickLog对象", description="用户点击模块界面内容日志")
public class ClickLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "模块id")
    @TableField("moduleId")
    private Integer moduleId;

    @ApiModelProperty(value = "模块名称")
    @TableField("moduleName")
    private String moduleName;

    @ApiModelProperty(value = "点击目标（点击内容）")
    @TableField("ClickTarget")
    private String ClickTarget;

    @ApiModelProperty(value = "点击描述")
    @TableField("clickDescr")
    private String clickDescr;

    @ApiModelProperty(value = "操作人id")
    @TableField("operatorId")
    private Integer operatorId;

    @ApiModelProperty(value = "操作人名称")
    @TableField("operatorName")
    private String operatorName;

    @ApiModelProperty(value = "操作部门ID")
    @TableField("deptId")
    private Integer deptId;

    @ApiModelProperty(value = "操作部门名称")
    @TableField("deptName")
    private String deptName;

    @ApiModelProperty(value = "IP地址")
    @TableField("ipAddress")
    private String ipAddress;

    @ApiModelProperty(value = "机器地址")
    @TableField("macAddress")
    private String macAddress;

    @ApiModelProperty(value = "操作系统描述")
    @TableField("osDescr")
    private String osDescr;


}
