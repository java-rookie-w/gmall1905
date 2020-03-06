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
 * 组织部门表
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysOrganizations对象", description="组织部门表")
public class SysOrganizations implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "企业id")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "上级部门ID")
    @TableField("PARENTID")
    private Integer parentid;

    @ApiModelProperty(value = "子部门数")
    @TableField("SUBCOUNT")
    private Integer subcount;

    @ApiModelProperty(value = "序号")
    @TableField("SEQ")
    private Integer seq;

    @ApiModelProperty(value = "子部门分配最大编码")
    @TableField("MAXCODE")
    private Integer maxcode;

    @ApiModelProperty(value = "部门名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "部门联系方式")
    @TableField("CONTACTWAY")
    private String contactway;

    @ApiModelProperty(value = "部门内置类型码")
    @TableField("ORGINTERNALCODE")
    private String orginternalcode;

    @ApiModelProperty(value = "部门名称简拼")
    @TableField("SIMPLEPINYIN")
    private String simplepinyin;

    @ApiModelProperty(value = "部门名称全拼")
    @TableField("FULLPINYIN")
    private String fullpinyin;

    @ApiModelProperty(value = "备注")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty(value = "创建用户")
    @TableField("CREATEUSER")
    private String createuser;

    @ApiModelProperty(value = "更新用户名")
    @TableField("UPDATEUSER")
    private String updateuser;

    @ApiModelProperty(value = "更新用户")
    @TableField("UPDATEDATE")
    private Date updatedate;

    @ApiModelProperty(value = "创建日期")
    @TableField("CREATEDATE")
    private Date createdate;

    @ApiModelProperty(value = "企业简称")
    @TableField("abbreviation")
    private String abbreviation;

    @ApiModelProperty(value = "所属城市")
    @TableField("city")
    private Integer city;

    @ApiModelProperty(value = "合同容量（kVA）")
    @TableField("contract_capacity")
    private String contractCapacity;

    @ApiModelProperty(value = "运行容量（kVA）")
    @TableField("operating_capacity")
    private String operatingCapacity;

    @ApiModelProperty(value = "户号")
    @TableField("household_num")
    private String householdNum;

    @ApiModelProperty(value = "电压等级")
    @TableField("voltage_level")
    private String voltageLevel;

    @ApiModelProperty(value = "地址")
    @TableField("addr")
    private String addr;

    @ApiModelProperty(value = "用电经理")
    @TableField("power_manager")
    private String powerManager;

    @ApiModelProperty(value = "用户负责人")
    @TableField("power_head")
    private String powerHead;

    @ApiModelProperty(value = "用电经理电话")
    @TableField("manager_phone")
    private String managerPhone;

    @ApiModelProperty(value = "用户负责人电话")
    @TableField("head_phone")
    private String headPhone;

    @TableField("annexes")
    private String annexes;

    @ApiModelProperty(value = "所属区域")
    @TableField("area_id")
    private String areaId;

    @ApiModelProperty(value = "经度")
    @TableField("xaxis")
    private String xaxis;

    @ApiModelProperty(value = "纬度")
    @TableField("yaxis")
    private String yaxis;

    @ApiModelProperty(value = "企业类型")
    @TableField("qylx")
    private String qylx;

    @ApiModelProperty(value = "合同开始时间")
    @TableField("htkssj")
    private Date htkssj;

    @ApiModelProperty(value = "合同截止时间")
    @TableField("htjzsj")
    private Date htjzsj;

    @ApiModelProperty(value = "合同附件")
    @TableField("htfj")
    private String htfj;

    @ApiModelProperty(value = "合同描述")
    @TableField("htms")
    private String htms;

    @ApiModelProperty(value = "备注")
    @TableField("bz")
    private String bz;

    @ApiModelProperty(value = "合同附件路径")
    @TableField("filePath")
    private String filePath;

    @ApiModelProperty(value = "安装单位")
    @TableField("installation_company")
    private String installationCompany;

    @ApiModelProperty(value = "街道")
    @TableField("street")
    private String street;

    @ApiModelProperty(value = "视频服务器IP")
    @TableField("video_ip")
    private String videoIp;

    @ApiModelProperty(value = "视频服务器端口")
    @TableField("video_port")
    private String videoPort;

    @ApiModelProperty(value = "video_username")
    @TableField("video_username")
    private String videoUsername;

    @ApiModelProperty(value = "视频服务器登入密码")
    @TableField("video_password")
    private String videoPassword;

    @ApiModelProperty(value = "视频服务器类型")
    @TableField("video_streamtype")
    private Integer videoStreamtype;

    @ApiModelProperty(value = "企业类别")
    @TableField("custype")
    private String custype;

    @ApiModelProperty(value = "企业log路径")
    @TableField("company_log_path")
    private String companyLogPath;

    @ApiModelProperty(value = "企业图片路径")
    @TableField("company_image_path")
    private String companyImagePath;

    @ApiModelProperty(value = "客户代码")
    @TableField("customer_code")
    private String customerCode;

    @ApiModelProperty(value = "合同编号")
    @TableField("contract_number")
    private String contractNumber;

    @ApiModelProperty(value = "用户简介")
    @TableField("user_summary")
    private String userSummary;

    @ApiModelProperty(value = "服务内容")
    @TableField("service_content")
    private String serviceContent;

    @ApiModelProperty(value = "表计类型")
    @TableField("meter_type")
    private String meterType;

    @ApiModelProperty(value = "在线监测")
    @TableField("online_monitoring")
    private String onlineMonitoring;

    @ApiModelProperty(value = "短信发送状态 1：已发送 0：未发送")
    @TableField("smsState")
    private String smsState;

    @ApiModelProperty(value = "行业类型")
    @TableField("industry")
    private Integer industry;

    @ApiModelProperty(value = "变压器总数(台)")
    @TableField("contract_transformers")
    private String contractTransformers;

    @ApiModelProperty(value = "运行变压器(台)")
    @TableField("operating_transformers")
    private String operatingTransformers;

    @ApiModelProperty(value = "标志（1-启用，0-不启用）默认为1")
    @TableField("flag")
    private String flag;

    @ApiModelProperty(value = "区域管理")
    @TableField("region")
    private String region;


}
