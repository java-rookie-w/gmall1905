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
 * 缺陷图片
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ChkBugPic对象", description="缺陷图片")
public class ChkBugPic implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "缺陷ID")
    @TableField("bug_id")
    private Integer bugId;

    @ApiModelProperty(value = "照片类型（1缺陷 2消缺）")
    @TableField("pic_type")
    private Integer picType;

    @ApiModelProperty(value = "图片大小")
    @TableField("pic_size")
    private Integer picSize;

    @ApiModelProperty(value = "图片路径")
    @TableField("pic_path")
    private String picPath;


}
