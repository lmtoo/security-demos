package com.lubansoft.security.demos.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

/**
 * @Author 李乐
 * @Date 2016/10/27 0027 15:46.
 */
@Component
public class HelloMessageService implements MessageService {

    @PreAuthorize("authenticated")
    public String getMessage() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello " + authentication;
    }
}
