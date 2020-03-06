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
 * 车辆信息
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysCarInfo对象", description="车辆信息")
public class SysCarInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "车牌号")
    @TableField("car_no")
    private String carNo;

    @ApiModelProperty(value = "车辆型号")
    @TableField("car_model")
    private String carModel;

    @ApiModelProperty(value = "车辆状态（ 字典表）")
    @TableField("car_state")
    private Integer carState;

    @ApiModelProperty(value = "运维企业ID")
    @TableField("company_id")
    private Integer companyId;

    @ApiModelProperty(value = "车辆性质")
    @TableField("carNature")
    private String carNature;


}
