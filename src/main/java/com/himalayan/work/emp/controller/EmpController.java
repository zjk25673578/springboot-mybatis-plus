package com.himalayan.work.emp.controller;


import com.himalayan.work.emp.model.Emp;
import com.himalayan.work.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zjk
 * @since 2018-12-25
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    protected EmpService empService;

    @RequestMapping("/list")
    public String list(Model model) {
        List<Emp> list = empService.list();
        model.addAttribute("list", list);
        model.addAttribute("url", "https://www.baidu.com");
        return "emp/list";
    }

    @RequestMapping("/emp")
    public String emp(String empno, Model model) {
        String label;
        if (empno != null && empno.trim().length() > 0) {
            label = "修改";
            Emp emp = empService.getById(empno);
            model.addAttribute("emp", emp);
        } else {
            label = "添加";
            model.addAttribute("emp", new Emp());
        }
        model.addAttribute("label", label);
        return "emp/emp";
    }

    @RequestMapping("/update")
    public String update(Emp emp, Model model) {
        boolean r = empService.saveOrUpdate(emp);
        model.addAttribute("result", r);
        return "message";
    }
}
