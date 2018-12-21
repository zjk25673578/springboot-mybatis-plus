package com.himalayan.work.users.controller;

import com.himalayan.work.users.model.Users;
import com.himalayan.work.users.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 系统用户表 前端控制器
 *
 * @author zjk
 * @since 2018-12-20
 */
@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping(value = "/users.html")
    public String users(Users user, Model mav) {
        List<Users> list = usersService.list(user);
        mav.addAttribute("users", list);
        return "users/list";
    }
    /*public ModelAndView users(Users user, ModelAndView mav) {
        List<Users> list = usersService.list(user);
        mav.addObject("users", list);
        mav.setViewName("users/list");
        return mav;
    }*/
}
