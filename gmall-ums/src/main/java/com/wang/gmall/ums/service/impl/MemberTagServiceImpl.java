package com.wang.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.gmall.ums.entity.MemberTag;
import com.wang.gmall.ums.mapper.MemberTagMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户标签表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-08
 */
@Service
public class MemberTagServiceImpl extends ServiceImpl<MemberTagMapper, MemberTag> implements IService<MemberTag> {

}
