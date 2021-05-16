package com.mxk.test;

import com.mxk.config.AppConfig;
import com.mxk.service.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AopTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/10 10:49
 **/
public class AopTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserDao userDao = context.getBean(UserDao.class);
        userDao.say();
//        userDao.cry();
    }
}
