package com.test;

import com.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: Twossm
 * @description: 11
 * DevelopTools : IntelliJ IDEA 2019.3.1
 * DevelopSystem : windows 10
 * Company : org.yhn
 * @author : YangHaiNan
 * @create: 2020-01-23 16:18
 * @version : 1.0
 */
public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();
    }
}
