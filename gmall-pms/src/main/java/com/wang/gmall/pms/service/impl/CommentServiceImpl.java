package com.wang.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.gmall.pms.entity.Comment;
import com.wang.gmall.pms.mapper.CommentMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-08
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements IService<Comment> {

}
