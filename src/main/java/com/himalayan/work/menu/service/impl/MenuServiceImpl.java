package com.himalayan.work.menu.service.impl;

import com.himalayan.work.menu.model.Menu;
import com.himalayan.work.menu.dao.MenuMapper;
import com.himalayan.work.menu.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统菜单表 服务实现类
 * </p>
 *
 * @author zjk
 * @since 2018-12-20
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
