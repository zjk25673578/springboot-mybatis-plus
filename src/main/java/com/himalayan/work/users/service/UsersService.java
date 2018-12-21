package com.himalayan.work.users.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.himalayan.work.users.model.Users;

import java.util.List;

/**
 * <p>
 * 系统用户表 服务类
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
public interface UsersService extends IService<Users> {

    List<Users> list(Users user);
}
