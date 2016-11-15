package com.lubansoft.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 李乐
 * @Date 2016/11/14 0014 10:19.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/index")
    public String index() {
        return "admin/index";
    }
}
