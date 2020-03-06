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
 * 系统参数
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Sysparameter对象", description="系统参数")
public class Sysparameter implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableField("ID")
    private Integer id;

    @ApiModelProperty(value = "参数英文名")
    @TableField("NAMEEN")
    private String nameen;

    @ApiModelProperty(value = "参数中文名")
    @TableField("NAMECN")
    private String namecn;

    @ApiModelProperty(value = "属性值")
    @TableField("VALUE")
    private String value;

    @ApiModelProperty(value = "默认值")
    @TableField("DEFAULTVALUE")
    private String defaultvalue;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "模块用户类型ID:MIS_Sys.V_OprtType")
    @TableField("MODULEUSERTYPEID")
    private Integer moduleusertypeid;

    @ApiModelProperty(value = "操作人id")
    @TableField("OPRTID")
    private Integer oprtid;

    @ApiModelProperty(value = "操作人名称")
    @TableField("OPRTNAME")
    private String oprtname;

    @ApiModelProperty(value = "操作时间")
    @TableField("OPRTTIME")
    private Date oprttime;

    @ApiModelProperty(value = "备注2")
    @TableField("REMARK2")
    private String remark2;


}
