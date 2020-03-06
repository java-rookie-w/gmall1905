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
 * 巡检计划对应签字照片
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ChkCheckPlanAutograph对象", description="巡检计划对应签字照片")
public class ChkCheckPlanAutograph implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "巡检计划主键")
    @TableField("plan_id")
    private Integer planId;

    @ApiModelProperty(value = "类型 1巡检负责人签字 2巡检成员签字 3用电企业负责人签字")
    @TableField("pic_type")
    private Integer picType;

    @ApiModelProperty(value = "签名照片存储路径")
    @TableField("pic_path")
    private String picPath;

    @ApiModelProperty(value = "签名照片大小")
    @TableField("pic_size")
    private Integer picSize;


}
