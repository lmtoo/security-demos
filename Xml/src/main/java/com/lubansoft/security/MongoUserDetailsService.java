package com.lubansoft.security;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

/**
 * @Author 李乐
 * @Date 2016/10/27 0027 15:10.
 */
public class MongoUserDetailsService extends JdbcDaoImpl implements UserDetailsService {
}
