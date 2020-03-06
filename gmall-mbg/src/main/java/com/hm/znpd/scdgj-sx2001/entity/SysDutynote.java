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
 * 值班日志
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysDutynote对象", description="值班日志")
public class SysDutynote implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "记录号")
    @TableField("dutyId")
    private String dutyId;

    @TableField("happenTime")
    private Date happenTime;

    @ApiModelProperty(value = "记事人id")
    @TableField("oprtId")
    private String oprtId;

    @ApiModelProperty(value = "记事人")
    @TableField("oprtName")
    private String oprtName;

    @ApiModelProperty(value = "记事时间")
    @TableField("oprtTime")
    private Date oprtTime;

    @ApiModelProperty(value = "记事部门id")
    @TableField("deptId")
    private Integer deptId;

    @ApiModelProperty(value = "记录部门")
    @TableField("deptName")
    private String deptName;

    @TableField("noteinfo")
    private String noteinfo;

    @TableField("notetype")
    private String notetype;

    @ApiModelProperty(value = "状态")
    @TableField("state")
    private String state;


}
