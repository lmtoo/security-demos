package com.lubansoft.security.demos;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * 配置Web环境下的SpringSecurity
 *
 * @Author 李乐
 * @Date 2016/10/19 0019 16:26.
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    /**
     * 依赖spring或者springMVC的配置
     * 为所有的URL自动添加springSecurityFilterChain的filter<br>
     * WebSecurityConfig配置文件将由springmvc加载
     */
    public SecurityWebApplicationInitializer() {
    }
}
