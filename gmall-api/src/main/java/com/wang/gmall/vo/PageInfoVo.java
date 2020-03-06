package com.wang.gmall.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ApiModel
@Data
public class PageInfoVo {
    @ApiModelProperty("总记录数")
    private Long total;

    @ApiModelProperty("总页数")
    private Long pagetotal;

    @ApiModelProperty("当前页条数")
    private Long size;

    @ApiModelProperty("当前页数")
    private Long pageNum;

    @ApiModelProperty("查询出的数据")
    private List<? extends Object> result;
}
