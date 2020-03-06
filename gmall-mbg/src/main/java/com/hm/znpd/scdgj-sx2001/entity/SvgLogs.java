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
@ApiModel(value="SvgLogs对象", description="")
public class SvgLogs implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("create_by")
    private String createBy;

    @TableField("create_time")
    private Date createTime;

    @TableField("del_flag")
    private Integer delFlag;

    @TableField("update_by")
    private String updateBy;

    @TableField("update_time")
    private Date updateTime;

    @TableField("cost_time")
    private Integer costTime;

    @TableField("ip")
    private String ip;

    @TableField("ip_info")
    private String ipInfo;

    @TableField("name")
    private String name;

    @TableField("request_param")
    private String requestParam;

    @TableField("request_type")
    private String requestType;

    @TableField("request_url")
    private String requestUrl;

    @TableField("username")
    private String username;

    @TableField("log_type")
    private Integer logType;


}
