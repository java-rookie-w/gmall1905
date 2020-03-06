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
 * 测点
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="BsdMeasPoint对象", description="测点")
public class BsdMeasPoint implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "测点名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "测点类型，对应 bsd_meas_type.id")
    @TableField("meas_type_id")
    private Integer measTypeId;

    @ApiModelProperty(value = "设备ID，对应 bsd_device.id")
    @TableField("device_id")
    private Integer deviceId;

    @ApiModelProperty(value = "状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "计量单位")
    @TableField("unit")
    private String unit;

    @ApiModelProperty(value = "是否启用  0不启用 1启用")
    @TableField("is_start")
    private Boolean isStart;

    @ApiModelProperty(value = "企业id ,对应 sys_organizations.id")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = "标准值")
    @TableField("standard_value")
    private BigDecimal standardValue;

    @ApiModelProperty(value = "一级下限阈值")
    @TableField("one_lower_limit")
    private BigDecimal oneLowerLimit;

    @ApiModelProperty(value = "一级上限阈值")
    @TableField("one_upper_limit")
    private BigDecimal oneUpperLimit;

    @ApiModelProperty(value = "二级下限阈值")
    @TableField("two_lower_limit")
    private BigDecimal twoLowerLimit;

    @ApiModelProperty(value = "二级上限阈值")
    @TableField("two_upper_limit")
    private BigDecimal twoUpperLimit;

    @ApiModelProperty(value = "三级下限阈值")
    @TableField("three_lower_limit")
    private BigDecimal threeLowerLimit;

    @ApiModelProperty(value = "三级上限阈值")
    @TableField("three_upper_limit")
    private BigDecimal threeUpperLimit;

    @ApiModelProperty(value = "变比系数,阈值单位（百分比或增减量）")
    @TableField("limit_unit")
    private String limitUnit;

    @ApiModelProperty(value = "告警判断持续时间,连续超阈值的时间被认为告警(秒)")
    @TableField("continue_time")
    private Integer continueTime;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "数据项名称, 用于采集数据与平台数据匹配，串口号_站号_路数_测量类型")
    @TableField("data_mc")
    private String dataMc;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
