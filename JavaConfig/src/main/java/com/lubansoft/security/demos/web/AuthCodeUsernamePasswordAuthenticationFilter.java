package com.lubansoft.security.demos.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 李乐
 * @Date 2016/10/27 0027 16:37.
 */
public class AuthCodeUsernamePasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    public static final String SPRING_SECURITY_AUTH_CODE_KEY = "authcode";

    private String authCodeParameter = SPRING_SECURITY_AUTH_CODE_KEY;


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        //TODO:验证码验证逻辑


        //TODO:验证失败抛出验证码异常
        String authCode = request.getParameter(authCodeParameter);
        if (authCode == null || authCode.length() == 0) {
            throw new BadAuthCodeException("验证码不能为空");
        }

        return super.attemptAuthentication(request, response);
    }
}
