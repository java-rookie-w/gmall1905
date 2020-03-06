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
 * 巡检内容
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ChkCheckContent对象", description="巡检内容")
public class ChkCheckContent implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "检查项ID（chk_check_item表主键）")
    @TableField("item_id")
    private Integer itemId;

    @ApiModelProperty(value = " 巡检内容")
    @TableField("check_content")
    private String checkContent;

    @ApiModelProperty(value = "是否默认勾选 0否，1是")
    @TableField("is_check")
    private Integer isCheck;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
