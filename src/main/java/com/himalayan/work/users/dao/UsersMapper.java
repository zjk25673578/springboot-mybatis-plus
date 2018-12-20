package com.himalayan.work.users.dao;

import com.himalayan.work.users.model.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 系统用户表 Mapper 接口
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
public interface UsersMapper extends BaseMapper<Users> {

    Integer newCount();
}
