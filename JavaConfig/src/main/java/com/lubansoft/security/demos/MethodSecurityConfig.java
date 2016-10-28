package com.lubansoft.security.demos;

import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;

/**
 * 对方法级别的支持
 *
 * @Author 李乐
 * @Date 2016/10/20 0020 11:20.
 */
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {


    @Override
    protected MethodSecurityExpressionHandler createExpressionHandler() {
        return super.createExpressionHandler();
    }
}
