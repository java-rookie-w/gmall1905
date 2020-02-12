package com.wang.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.gmall.ums.entity.MemberTask;
import com.wang.gmall.ums.mapper.MemberTaskMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员任务表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-08
 */
@Service
public class MemberTaskServiceImpl extends ServiceImpl<MemberTaskMapper, MemberTask> implements IService<MemberTask> {

}
