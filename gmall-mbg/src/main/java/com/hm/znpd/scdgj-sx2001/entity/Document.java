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
 * 附件
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Document对象", description="附件")
public class Document implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    @TableField("ID")
    private Integer id;

    @ApiModelProperty(value = "业务模块表记录ID(或主表记录ID)")
    @TableField("PID")
    private Integer pid;

    @ApiModelProperty(value = "业务模块类型")
    @TableField("PROJTYPE")
    private Integer projtype;

    @ApiModelProperty(value = "业务模块文档子类型(附件的文档分类)")
    @TableField("DOCUTYPE")
    private Integer docutype;

    @ApiModelProperty(value = "文件名称(不带扩展名)")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "文件名称(带扩展名)")
    @TableField("FILENAME")
    private String filename;

    @ApiModelProperty(value = "是否有效(1-是0-否)")
    @TableField("FLAG")
    private String flag;

    @ApiModelProperty(value = "操作人ID")
    @TableField("OPRTID")
    private Integer oprtid;

    @ApiModelProperty(value = "操作人名称")
    @TableField("OPRTNAME")
    private String oprtname;

    @ApiModelProperty(value = "操作时间")
    @TableField("OPRTTIME")
    private Date oprttime;

    @ApiModelProperty(value = "操作部门ID")
    @TableField("DEPTID")
    private Integer deptid;

    @ApiModelProperty(value = "操作部门名称")
    @TableField("DEPTNAME")
    private String deptname;

    @ApiModelProperty(value = "上传类型（0-保存到数据库，1-保存到硬盘）")
    @TableField("SAVETYPE")
    private Integer savetype;

    @ApiModelProperty(value = "保存路径(相对）")
    @TableField("SAVEDIR")
    private String savedir;

    @ApiModelProperty(value = "文件大小(byte)")
    @TableField("FILESIZE")
    private Double filesize;

    @ApiModelProperty(value = "文件唯一名称")
    @TableField("FILENAME_UNIQUE")
    private String filenameUnique;

    @ApiModelProperty(value = "文件唯一名称(缩略图:缩小比率)（后缀名： _small）")
    @TableField("FILENAME_UNIQUE_COMPRESS_SCALE")
    private String filenameUniqueCompressScale;

    @ApiModelProperty(value = "文件唯一名称(缩略图:尺寸不变，压缩质量)（后缀名： _middle）")
    @TableField("FILENAME_UNIQUE_COMPRESS_QUALITY")
    private String filenameUniqueCompressQuality;

    @ApiModelProperty(value = "文件格式")
    @TableField("FILEFORMAT")
    private String fileformat;

    @ApiModelProperty(value = "模块表代码")
    @TableField("TABLECODE")
    private String tablecode;

    @ApiModelProperty(value = "模块ID")
    @TableField("MODULEID")
    private Integer moduleid;

    @ApiModelProperty(value = "模块类ID")
    @TableField("CLASSID")
    private Integer classid;

    @ApiModelProperty(value = "表主键值（或从表记录ID）")
    @TableField("TABLERECORDID")
    private Integer tablerecordid;

    @ApiModelProperty(value = "图片标识(1-是，0-否)")
    @TableField("PICTUREFLAG")
    private Integer pictureflag;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "模块类名")
    @TableField("CLASSNAME")
    private String classname;

    @ApiModelProperty(value = "GPS经纬度( lon,lat)")
    @TableField("GPS_LOCATE")
    private String gpsLocate;

    @ApiModelProperty(value = "GPS地址名称")
    @TableField("GPS_LOCATE_ADDR")
    private String gpsLocateAddr;


}
