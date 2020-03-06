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
 * 自定义属性
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysPropertydicts对象", description="自定义属性")
public class SysPropertydicts implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "领域属性id")
    @TableField("PROPERTYDOMAINID")
    private Integer propertydomainid;

    @ApiModelProperty(value = "系统内置id")
    @TableField("INTERNALID")
    private Integer internalid;

    @ApiModelProperty(value = "显示顺序")
    @TableField("DISPLAYSEQ")
    private Integer displayseq;

    @ApiModelProperty(value = "属性名称")
    @TableField("DISPLAYNAME")
    private String displayname;

    @ApiModelProperty(value = "简拼")
    @TableField("SIMPLEPINYIN")
    private String simplepinyin;

    @ApiModelProperty(value = "全拼")
    @TableField("FULLPINYIN")
    private String fullpinyin;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATEUSER")
    private String createuser;

    @ApiModelProperty(value = "修改人")
    @TableField("UPDATEUSER")
    private String updateuser;

    @ApiModelProperty(value = "创建时间")
    @TableField("CREATEDATE")
    private Date createdate;

    @ApiModelProperty(value = "修改时间")
    @TableField("UPDATEDATE")
    private Date updatedate;

    @ApiModelProperty(value = "是否停用，0：否，1：是")
    @TableField("ISDISABLE")
    private Integer isdisable;


}
