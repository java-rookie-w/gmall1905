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
 * 系统消息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysMsg对象", description="系统消息")
public class SysMsg implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("msg_from")
    private String msgFrom;

    @TableField("msg_type")
    private String msgType;

    @TableField("msg_content")
    private String msgContent;

    @TableField("send_time")
    private String sendTime;

    @TableField("msg_status")
    private String msgStatus;

    @TableField("url")
    private String url;

    @TableField("customer_id")
    private String customerId;

    @TableField("is_read")
    private String isRead;

    @TableField("rec")
    private String rec;


}
