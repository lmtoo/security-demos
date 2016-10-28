package com.lubansoft.service;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * HelloMessageService Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮ�� 27, 2016</pre>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:security.xml")
public class HelloMessageServiceTest {

    @Autowired
    private MessageService messageService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getMessage()
     */
    @Test(expected = AuthenticationCredentialsNotFoundException.class)
    public void testGetMessage() throws Exception {
        messageService.getMessage();
    }


} 
