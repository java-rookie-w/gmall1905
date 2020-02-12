package com.wang.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.gmall.pms.entity.Album;
import com.wang.gmall.pms.mapper.AlbumMapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-08
 */
@Service
@Component
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements IService<Album> {

}
