package com.lubansoft.security.demos.security;

import com.lubansoft.security.demos.customs.SpringDataUserDetailsService;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * 对wab级别的配置
 *
 * @Author 李乐
 * @Date 2016/10/19 0019 16:12.
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 安全提示消息国际化的支持
     *
     * @return
     */
    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("classpath:org/springframework/security/messages");
        return new ReloadableResourceBundleMessageSource();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new SpringDataUserDetailsService();
    }


//    @Bean
//    public AuthenticationProvider authProvider() {
//        return new DaoAuthenticationProvider();
//    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);


        auth
                .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER").and()
                .withUser("admin").password("password").roles("USER","ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .mvcMatchers("/resources/**", "/signup", "/about").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')")
                .anyRequest().authenticated().and()
                //自定义登陆入口
                .formLogin();
//                    .loginProcessingUrl("/loginprocess").permitAll()//表单提交验证登陆的地址
//                    .loginPage("/anotherlogin.jsp").permitAll();//登陆页面的地址
    }
}
