package com.himalayan.work.users.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.himalayan.work.users.model.Users;
import com.himalayan.work.users.dao.UsersMapper;
import com.himalayan.work.users.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Users> list(Users user) {
        QueryWrapper<Users> wrapper = new QueryWrapper<>();

        if (user.getUname() != null) {
            wrapper.like("uname", user.getUname());
        }
        if (user.getRname() != null) {
            wrapper.like("rname",user.getRname());
        }

        return list(wrapper);
    }
}
