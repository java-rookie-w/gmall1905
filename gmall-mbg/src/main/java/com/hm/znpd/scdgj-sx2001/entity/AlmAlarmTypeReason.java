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
 * 告警事件类型原因分析
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AlmAlarmTypeReason对象", description="告警事件类型原因分析")
public class AlmAlarmTypeReason implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "告警类型ID（alm_alarm_type.id）")
    @TableField("alarmTypeId")
    private Integer alarmTypeId;

    @ApiModelProperty(value = "排序号")
    @TableField("sortNo")
    private Integer sortNo;

    @ApiModelProperty(value = "告警原因类型（1-网络，2-设备，3-软件，4-其他）")
    @TableField("typeId")
    private String typeId;

    @ApiModelProperty(value = "原因描述")
    @TableField("reasonDescr")
    private String reasonDescr;

    @ApiModelProperty(value = "解决方法")
    @TableField("resolvent")
    private String resolvent;

    @ApiModelProperty(value = "创建时间")
    @TableField("createDate")
    private Date createDate;

    @ApiModelProperty(value = "创建人名称")
    @TableField("createUser")
    private String createUser;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
