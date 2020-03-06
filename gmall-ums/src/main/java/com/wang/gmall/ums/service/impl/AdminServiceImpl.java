package com.wang.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wang.gmall.ums.entity.Admin;
import com.wang.gmall.ums.mapper.AdminMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.gmall.ums.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.sql.Wrapper;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-08
 */
@Service
@Component
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
    //这里的@Resource为byname，autowired为bytype
    //    @Resource
    @Autowired(required=false)
    AdminMapper adminMapper;
    @Override
    public Admin login(String username, String password) {
        //md5加密
        String pw = DigestUtils.md5DigestAsHex(password.getBytes());
        QueryWrapper<Admin> wrapper = new QueryWrapper<Admin>().eq("username",username).eq("password",pw);
        Admin admin = adminMapper.selectOne(wrapper);
        return admin;
    }

    @Override
    public Admin getAdminInfo(String name) {
        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("username",name));
    }
}
