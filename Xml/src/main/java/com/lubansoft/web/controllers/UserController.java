package com.lubansoft.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author 李乐
 * @Date 2016/11/14 0014 13:22.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    @Resource(name = "userDetailsManager")
    private UserDetailsManager userDetailsManager;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 修改用户名和密码
     *
     * @param oldPassword
     * @param newPassword
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/changePassword", produces = MediaType.TEXT_PLAIN_VALUE, method = RequestMethod.POST)
    public String changePassword(@RequestParam("oldPassword") String oldPassword, @RequestParam("newPassword") String newPassword) {
        newPassword = passwordEncoder.encode(newPassword);
        userDetailsManager.changePassword(oldPassword, newPassword);
        return "修改成功";
    }

    /**
     * 重定向到修改密码页面
     *
     * @return
     */
    @RequestMapping(value = "/changePassword", method = RequestMethod.GET)
    public String toChangePassword() {
        return "changePassword";
    }
}
