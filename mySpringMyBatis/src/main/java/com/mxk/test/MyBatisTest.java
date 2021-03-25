package com.mxk.test;

import com.mxk.config.AppConfig;
import com.mxk.dao.CardDao;
import com.mxk.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @ClassName MyBatisTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/17 14:25
 **/
public class MyBatisTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        ((CardDao)context.getBean("cardDao")).list("mxk");
        CardDao cardDao = (CardDao) context.getBean("cardDao");
        cardDao.list("mxk");
    }
}
