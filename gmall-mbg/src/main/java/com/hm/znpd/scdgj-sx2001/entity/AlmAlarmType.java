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
 * 告警类型
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AlmAlarmType对象", description="告警类型")
public class AlmAlarmType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "告警类型")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "告警大类")
    @TableField("code")
    private String code;

    @ApiModelProperty(value = "测量类型id，对应 bsd_meas_type.id")
    @TableField("meas_type_id")
    private String measTypeId;

    @ApiModelProperty(value = "类型（yc-遥测，yx-遥信）")
    @TableField("type")
    private String type;

    @ApiModelProperty(value = "前置机的上下限的等级设置")
    @TableField("level")
    private String level;

    @ApiModelProperty(value = "是否确认按钮0 代表为确认 ，1代表已经确认")
    @TableField("cfm_flag")
    private String cfmFlag;

    @ApiModelProperty(value = "企业id(=sys_organizations.id )")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = "事件设置id，对应event_set_id.id")
    @TableField("event_set_id")
    private Integer eventSetId;

    @ApiModelProperty(value = "删除标志")
    @TableField("del_flag")
    private String delFlag;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;


}
