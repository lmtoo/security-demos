package com.lubansoft.service;

import org.junit.Test;
import org.springframework.security.crypto.codec.Base64;
import sun.misc.BASE64Decoder;

/**
 * @Author 李乐
 * @Date 2016/11/14 0014 10:59.
 */
public class CookieTest {

    @Test
    public void test(){
        String cookie="cm9vdDoxNDgwMzAxMjI0Njg2OjM5M2RlZjFlYWM5ZDE4ZGU4YzdlM2JlM2MyNTNhOWQ5";
        System.out.println(new String(Base64.decode(cookie.getBytes())));
    }
}
