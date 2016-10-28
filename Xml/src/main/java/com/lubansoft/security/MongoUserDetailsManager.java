package com.lubansoft.security;

import org.springframework.security.provisioning.GroupManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

/**
 * 基于mongodb的userDetail
 *
 * @Author 李乐
 * @Date 2016/10/27 0027 14:56.
 */
public class MongoUserDetailsManager extends JdbcUserDetailsManager implements UserDetailsManager, GroupManager {

}
