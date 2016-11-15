package com.lubansoft.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author 李乐
 * @Date 2016/11/11 0011 16:47.
 */
@Controller
public class LoginLogoutController {

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String home() {
        System.out.println("进入登陆页面");
        return "login";
    }
}
