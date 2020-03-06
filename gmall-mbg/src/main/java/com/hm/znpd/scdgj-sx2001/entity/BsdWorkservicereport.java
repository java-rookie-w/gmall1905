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
 * 
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="BsdWorkservicereport对象", description="")
public class BsdWorkservicereport implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("xsbm")
    private String xsbm;

    @TableField("xsy")
    private String xsy;

    @TableField("time")
    private String time;

    @TableField("caozuobumen")
    private String caozuobumen;

    @TableField("caozuoren")
    private String caozuoren;

    @TableField("createtime")
    private String createtime;

    @TableField("beizhu")
    private String beizhu;


}
