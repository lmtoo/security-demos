package com.lubansoft.web.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Author 李乐
 * @Date 2016/10/25 0025 14:28.
 */
public class WebRequestLoggingFilter extends GenericFilterBean {

    private static Logger logger = LoggerFactory.getLogger(WebRequestLoggingFilter.class);

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        logger.info("客户端：{}，请求地址：{}", request.getRemoteAddr(), request.getContextPath());
        filterChain.doFilter(servletRequest, servletResponse);
        SecurityContextHolder.getContext().getAuthentication();
    }
}
