package com.mxk.test;

import com.mxk.config.AppConfig;
import com.mxk.dao.OrderDao;
import com.mxk.service.OrderServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * 接口 Dao 有两个实现类 ADaoImpl，BDaoImpl
 * 当调用 Dao 的一个方法的时候，根据传入 A 或者 B
 * 分别调用 ADaoImpl，BDaoImpl 的实现
 *
 * 第一种方式：@AutoWired private Map<String,OrderDao> map;  这个 map 可以直接拿到 A 和 B实现类
 * 第二种方式： OrderServiceImpl 实现 ApplicationContextAware 接口，拿到 applicationContext
 *          根据传入的 A 或者 B 去判断，从 applicationContext 取出对应的实现类去调用对应的方法
 **/
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderDao service = context.getBean(OrderDao.class);
//        service.update("A");

        OrderServiceImpl service = context.getBean(OrderServiceImpl.class);
        service.query("B");

    }
}
