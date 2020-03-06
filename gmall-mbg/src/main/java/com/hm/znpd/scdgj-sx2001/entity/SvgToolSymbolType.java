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
 * 图元分类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SvgToolSymbolType对象", description="图元分类")
public class SvgToolSymbolType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "编码")
    @TableField("code")
    private String code;

    @ApiModelProperty(value = "节点类型(0目录1节点)")
    @TableField("node_type")
    private Integer nodeType;

    @ApiModelProperty(value = "修改时间")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "状态 1.有效 0. 无效")
    @TableField("state")
    private Integer state;

    @ApiModelProperty(value = "名称")
    @TableField("text")
    private String text;

    @ApiModelProperty(value = "父节点")
    @TableField("parent_id")
    private Integer parentId;

    @ApiModelProperty(value = "简拼")
    @TableField("simple_pinyin")
    private String simplePinyin;

    @ApiModelProperty(value = "名称连接")
    @TableField("text_all")
    private String textAll;

    @ApiModelProperty(value = "简拼连接")
    @TableField("simple_pinyin_all")
    private String simplePinyinAll;

    @TableField("pinyin")
    private String pinyin;


}
