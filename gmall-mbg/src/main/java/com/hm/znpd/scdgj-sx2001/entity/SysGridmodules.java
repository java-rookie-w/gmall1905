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
 * 用户列表自定义显示
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysGridmodules对象", description="用户列表自定义显示")
public class SysGridmodules implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户")
    @TableField("USERID")
    private Integer userid;

    @ApiModelProperty(value = "列表Id")
    @TableField("GRIDID")
    private String gridid;

    @ApiModelProperty(value = "列表模型")
    @TableField("JSONDATA")
    private String jsondata;

    @ApiModelProperty(value = "创建人")
    @TableField("CREATEUSER")
    private String createuser;

    @ApiModelProperty(value = "创建日期")
    @TableField("CREATEDATE")
    private Date createdate;

    @ApiModelProperty(value = "更新日期")
    @TableField("UPDATEDATE")
    private Date updatedate;

    @ApiModelProperty(value = "更新人")
    @TableField("UPDATEUSER")
    private String updateuser;


}
