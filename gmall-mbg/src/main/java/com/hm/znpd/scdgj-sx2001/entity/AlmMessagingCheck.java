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
 * 
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AlmMessagingCheck对象", description="")
public class AlmMessagingCheck implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "Oracle告警id")
    @TableField("rid")
    private String rid;

    @ApiModelProperty(value = "Oracle告警企业名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "Oracle告警时间")
    @TableField("event_time")
    private String eventTime;

    @ApiModelProperty(value = "Oracle告警内容")
    @TableField("event_message")
    private String eventMessage;

    @ApiModelProperty(value = "短信发送时间")
    @TableField("send_time")
    private Date sendTime;


}
