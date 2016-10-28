package com.lubansoft.security.demos.customs;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询用户和相应的权限信息，只有AuthenticationManagerBuilder未配置，并且AuthenticationProviderBean未定义的情况下才起作用
 *
 * @Author 李乐
 * @Date 2016/10/20 0020 10:24.
 */
public class SpringDataUserDetailsService implements UserDetailsService {

    //将数据库中的
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        return new User(username, username, authorities);
    }
}
