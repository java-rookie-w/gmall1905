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
 * 巡检信息推送
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ChkInformationPush对象", description="巡检信息推送")
public class ChkInformationPush implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "企业id")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty(value = "用户名称")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty(value = "推送开始时间")
    @TableField("PUSH_TIME_START")
    private Date pushTimeStart;

    @ApiModelProperty(value = "推送结束时间")
    @TableField("PUSH_TIME_END")
    private Date pushTimeEnd;

    @ApiModelProperty(value = "推送内容")
    @TableField("CONTENT")
    private String content;

    @ApiModelProperty(value = "推送状态 0--未推送  1--已推送")
    @TableField("status")
    private Integer status;


}
