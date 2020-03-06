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
 * 企业附件表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysOrganizationsAttachment对象", description="企业附件表")
public class SysOrganizationsAttachment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "企业id")
    @TableField("organzation_id")
    private Integer organzationId;

    @ApiModelProperty(value = "附件名称")
    @TableField("attachment_name")
    private String attachmentName;

    @ApiModelProperty(value = "附件地址")
    @TableField("attachment_path")
    private String attachmentPath;

    @ApiModelProperty(value = "附件类型，1:用电知识，2：用户资料")
    @TableField("attachment_type")
    private String attachmentType;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "用户id串")
    @TableField("user_id")
    private String userId;


}
