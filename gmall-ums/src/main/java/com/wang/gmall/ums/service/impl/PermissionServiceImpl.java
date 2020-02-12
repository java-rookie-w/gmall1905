package com.wang.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.gmall.ums.entity.Permission;
import com.wang.gmall.ums.mapper.PermissionMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-08
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IService<Permission> {

}
