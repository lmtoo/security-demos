package com.lubansoft.security.demos.web;

import org.springframework.security.core.AuthenticationException;

/**
 * 验证码无效
 *
 * @Author 李乐
 * @Date 2016/10/27 0027 16:42.
 */
public class BadAuthCodeException extends AuthenticationException {
    /**
     * Constructs an {@code AuthenticationException} with the specified message and root
     * cause.
     *
     * @param msg the detail message
     * @param t   the root cause
     */
    public BadAuthCodeException(String msg, Throwable t) {
        super(msg, t);
    }

    /**
     * Constructs an {@code AuthenticationException} with the specified message and no
     * root cause.
     *
     * @param msg the detail message
     */
    public BadAuthCodeException(String msg) {
        super(msg);
    }
}
