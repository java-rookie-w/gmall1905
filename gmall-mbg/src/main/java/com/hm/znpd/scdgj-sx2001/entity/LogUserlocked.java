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
 * 用户锁定日志
 * </p>
 *
 * @author Lfy
 * @since 2020-02-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="LogUserlocked对象", description="用户锁定日志")
public class LogUserlocked implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "登录名")
    @TableField("no")
    private String no;

    @ApiModelProperty(value = "访问地址")
    @TableField("ip")
    private String ip;

    @ApiModelProperty(value = "计算机名")
    @TableField("computername")
    private String computername;

    @ApiModelProperty(value = "锁死时间")
    @TableField("locktime")
    private Date locktime;

    @ApiModelProperty(value = "手动解锁时间")
    @TableField("unlocktime_manu")
    private Date unlocktimeManu;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty(value = "计算机物理地址")
    @TableField("macaddress")
    private String macaddress;

    @ApiModelProperty(value = "操作系统及版本号")
    @TableField("os")
    private String os;

    @ApiModelProperty(value = "操作人")
    @TableField("oprtid")
    private String oprtid;

    @ApiModelProperty(value = "操作部门")
    @TableField("deptid")
    private String deptid;

    @ApiModelProperty(value = "解锁操作人部门ID")
    @TableField("deptid_unlock")
    private String deptidUnlock;

    @ApiModelProperty(value = "解锁操作人部门名称")
    @TableField("deptname_unlock")
    private String deptnameUnlock;

    @ApiModelProperty(value = "解锁操作人ID")
    @TableField("oprtid_unlock")
    private String oprtidUnlock;

    @ApiModelProperty(value = "解锁操作人名称")
    @TableField("oprtname_unlock")
    private String oprtnameUnlock;

    @ApiModelProperty(value = "解锁类型（1-自动解锁，2-人工解锁）")
    @TableField("unlocktype")
    private String unlocktype;

    @ApiModelProperty(value = "自动解锁时间")
    @TableField("unlocktime_auto")
    private Date unlocktimeAuto;


}
