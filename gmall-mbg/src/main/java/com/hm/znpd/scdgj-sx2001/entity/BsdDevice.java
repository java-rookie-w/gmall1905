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
 * 
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="BsdDevice对象", description="")
public class BsdDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "设备id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "设备名")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "设备编码(104协议 编码地址， MAC地址)NEW")
    @TableField("no")
    private String no;

    @ApiModelProperty(value = "设备类型  对应bsd_device_type.id")
    @TableField("device_type_id")
    private Integer deviceTypeId;

    @ApiModelProperty(value = " 父设备Id = bsd_device.id")
    @TableField("parent_id")
    private Integer parentId;

    @ApiModelProperty(value = "是否启用 0 禁用  1 启用")
    @TableField("is_start")
    private Boolean isStart;

    @ApiModelProperty(value = " 厂家编号（暂未启用）")
    @TableField("vandor_id")
    private Integer vandorId;

    @ApiModelProperty(value = "客户编号 对应sys_organizations.id")
    @TableField("customer_id")
    private Integer customerId;

    @ApiModelProperty(value = "前置机编号(手动维护： 用于通讯断开时的记录)")
    @TableField("rdp_no")
    private String rdpNo;

    @ApiModelProperty(value = "排序序号")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty(value = "设备地址（昊美协议）（导入台帐时生成的 ，  跟它对应的device_type_id有关系）device_type_id = 85时， device_addr 记录虚拟总表计算时，数据从哪些回路获取 。 device_type_id=44时，device_addr用于台帐导入时，监测测点的自动归类到所有的回路上。生成完台帐 ，device_type_id=44 的 device_addr就没有用了。 device_addr 在同一个customer_id下上唯一的 ")
    @TableField("device_addr")
    private String deviceAddr;

    @ApiModelProperty(value = "删除标记")
    @TableField("del_flag")
    private String delFlag;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private Date updateTime;

    @ApiModelProperty(value = "所属配电房ID")
    @TableField("substation_id")
    private Integer substationId;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty(value = "开关合闸地址（远程控制）")
    @TableField("addr_close")
    private String addrClose;

    @ApiModelProperty(value = "开关开闸地址（远程控制）")
    @TableField("addr_open")
    private String addrOpen;

    @ApiModelProperty(value = "变压器id(采集点需关联变压器ID)")
    @TableField("transformerId")
    private Integer transformerId;


}
