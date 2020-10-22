package com.mxk.proxy.test;

import com.mxk.ProxyApplication;
import com.mxk.proxy.dao.PersonDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/21 11:15
 **/
public class Test {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProxyApplication.class);
//        AnnotationConfigApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(ProxyApplication.class);
        System.out.println(applicationContext.getBean(PersonDao.class));
//        System.out.println(applicationContext.getBean(UserDao.class));



    }
}
