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
 * 任务表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysTask对象", description="任务表")
public class SysTask implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "任务是否关闭")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "任务组")
    @TableField("TASKGROUP")
    private String taskgroup;

    @ApiModelProperty(value = "任务描述")
    @TableField("DESCRIPTION")
    private String description;

    @ApiModelProperty(value = "策略id")
    @TableField("PLOYID")
    private Integer ployid;

    @TableField("CONFIG")
    private String config;

    @ApiModelProperty(value = "任务是否关闭")
    @TableField("CLOSED")
    private Integer closed;


}
