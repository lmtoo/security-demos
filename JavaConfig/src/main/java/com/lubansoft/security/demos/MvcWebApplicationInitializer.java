package com.lubansoft.security.demos;

import com.lubansoft.security.demos.security.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 注册WebSecurityConfig配置文件到ApplicationContext中
 *
 * @Author 李乐
 * @Date 2016/10/19 0019 16:43.
 */
public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        //将WebSecurityConfig配置加载到ApplicationContext中
        return new Class<?>[]{WebSecurityConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[0];
    }

    protected String[] getServletMappings() {
        return new String[0];
    }
}
