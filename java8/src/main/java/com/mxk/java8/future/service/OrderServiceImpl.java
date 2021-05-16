package com.mxk.java8.future.service;

import com.mxk.java8.future.entity.Order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/16 11:25
 **/
public class OrderServiceImpl {

    public List<Order> getAll(){
        List<Order> orders = new ArrayList<>();
        Order order1 = new Order(1,"test1", BigDecimal.valueOf(100));
        Order order2 = new Order(2,"test2", BigDecimal.valueOf(200));
        Order order3 = new Order(3,"test3", BigDecimal.valueOf(300));
        Order order4 = new Order(4,"test4", BigDecimal.valueOf(400));
        Order order5 = new Order(5,"test5", BigDecimal.valueOf(500));
        Order order6 = new Order(6,"test6", BigDecimal.valueOf(600));
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        return orders;
    }
}
