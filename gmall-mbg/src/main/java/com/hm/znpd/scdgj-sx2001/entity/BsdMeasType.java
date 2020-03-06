package com.hm.znpd.scdgj-sx2001.entity;

import java.math.BigDecimal;
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
@ApiModel(value="BsdMeasType对象", description="")
public class BsdMeasType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "编码（图元专用）")
    @TableField("code")
    private String code;

    @ApiModelProperty(value = "描述")
    @TableField("desc")
    private String desc;

    @ApiModelProperty(value = "已启用（1-是， 0 -否）")
    @TableField("is_start")
    private Boolean isStart;

    @ApiModelProperty(value = "计量单位")
    @TableField("unit")
    private String unit;

    @ApiModelProperty(value = "遥测/遥信")
    @TableField("fc")
    private String fc;

    @ApiModelProperty(value = "昊美宁波的编码")
    @TableField("code645")
    private String code645;

    @ApiModelProperty(value = "昊美之前的407上传数据用的数据对象")
    @TableField("hm645")
    private String hm645;

    @ApiModelProperty(value = "华云协议传输数据用的数据对象")
    @TableField("iec104")
    private String iec104;

    @TableField("standard_value")
    private BigDecimal standardValue;

    @TableField("one_lower_limit")
    private BigDecimal oneLowerLimit;

    @TableField("one_upper_limit")
    private BigDecimal oneUpperLimit;

    @TableField("two_lower_limit")
    private BigDecimal twoLowerLimit;

    @TableField("two_upper_limit")
    private BigDecimal twoUpperLimit;

    @TableField("three_lower_limit")
    private BigDecimal threeLowerLimit;

    @TableField("three_upper_limit")
    private BigDecimal threeUpperLimit;

    @TableField("limit_unit")
    private String limitUnit;

    @TableField("continue_time")
    private Integer continueTime;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    @TableField("parent_id")
    private Integer parentId;


}
