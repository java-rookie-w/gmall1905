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
 * 巡检计划包含检查内容
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ChkCheckPlanContent对象", description="巡检计划包含检查内容")
public class ChkCheckPlanContent implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "巡检计划ID")
    @TableField("plan_id")
    private Integer planId;

    @ApiModelProperty(value = "巡检内容ID")
    @TableField("content_id")
    private Integer contentId;

    @ApiModelProperty(value = "巡检结果 空为未巡检，0为正常， 1为有缺陷")
    @TableField("check_result")
    private Integer checkResult;


}
