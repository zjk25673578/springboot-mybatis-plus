package com.himalayan.work.users.service.impl;

import com.himalayan.work.users.model.Users;
import com.himalayan.work.users.dao.UsersMapper;
import com.himalayan.work.users.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Override
    public Integer newCount() {
        return baseMapper.newCount();
    }
}
