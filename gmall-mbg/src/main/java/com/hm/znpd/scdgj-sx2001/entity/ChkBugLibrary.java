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
 * 缺陷标准库
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ChkBugLibrary对象", description="缺陷标准库")
public class ChkBugLibrary implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "巡检内容ID（chk_check_content表主键）")
    @TableField("check_content_id")
    private Integer checkContentId;

    @ApiModelProperty(value = " 缺陷描述")
    @TableField("bug_description")
    private String bugDescription;

    @ApiModelProperty(value = "缺陷风险")
    @TableField("bug_risk")
    private String bugRisk;

    @ApiModelProperty(value = "解决方案建议")
    @TableField("solution_suggestion")
    private String solutionSuggestion;

    @ApiModelProperty(value = " 创建人")
    @TableField("create_user_id")
    private Integer createUserId;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    @TableField("update_user_id")
    private Integer updateUserId;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;


}
