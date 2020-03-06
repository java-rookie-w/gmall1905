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
 * 表主键值设置
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysTablekeyvalue对象", description="表主键值设置")
public class SysTablekeyvalue implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableField("ID")
    private Integer id;

    @ApiModelProperty(value = "模块ID")
    @TableField("moduleid")
    private Integer moduleid;

    @ApiModelProperty(value = "模块名称")
    @TableField("modulename")
    private String modulename;

    @ApiModelProperty(value = "表代码")
    @TableField("tablecode")
    private String tablecode;

    @ApiModelProperty(value = "表名称")
    @TableField("tablename")
    private String tablename;

    @ApiModelProperty(value = "表主键字段")
    @TableField("keyfield")
    private String keyfield;

    @ApiModelProperty(value = "最小值")
    @TableField("minvalue")
    private String minvalue;

    @ApiModelProperty(value = "最大值")
    @TableField("maxvalue")
    private String maxvalue;

    @ApiModelProperty(value = "下一值")
    @TableField("nextvalue")
    private String nextvalue;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty(value = "业务表编号字段")
    @TableField("recordNumField")
    private String recordNumField;

    @ApiModelProperty(value = "业务表编号字段流水号最大值")
    @TableField("recordNumMax")
    private String recordNumMax;


}
