package com.wang.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.gmall.ums.entity.MemberProductCategoryRelation;
import com.wang.gmall.ums.mapper.MemberProductCategoryRelationMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员与产品分类关系表（用户喜欢的分类） 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-08
 */
@Service
public class MemberProductCategoryRelationServiceImpl extends ServiceImpl<MemberProductCategoryRelationMapper, MemberProductCategoryRelation> implements IService<MemberProductCategoryRelation> {

}
