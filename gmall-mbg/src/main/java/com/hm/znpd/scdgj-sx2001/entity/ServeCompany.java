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
 * 企业信息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ServeCompany对象", description="企业信息")
public class ServeCompany implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "企业名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "联系人")
    @TableField("people")
    private String people;

    @ApiModelProperty(value = "联系电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "地址")
    @TableField("address")
    private String address;

    @ApiModelProperty(value = "营业执照")
    @TableField("imgpath")
    private String imgpath;

    @ApiModelProperty(value = "创建人id")
    @TableField("creater")
    private Integer creater;

    @ApiModelProperty(value = "创建人")
    @TableField("creater_name")
    private String createrName;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;


}
