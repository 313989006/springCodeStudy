package com.mxk.service;

import com.mxk.dao.OrderDao;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/27 16:18
 **/
@Service
public class OrderServiceImpl implements ApplicationContextAware {
//public class OrderServiceImpl{

//    @Autowired
//    private Map<String,OrderDao> map;

    ApplicationContext applicationContext;

    @Autowired
    private OrderDao orderDao;

    public void query(String name){
        if ("A".equals(name)){
            ((OrderDao)applicationContext.getBean("orderDaoAImpl")).update("a");
        } else if ("B".equals(name)){
            ((OrderDao)applicationContext.getBean("orderDaoBImpl")).update("b");
        }
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
