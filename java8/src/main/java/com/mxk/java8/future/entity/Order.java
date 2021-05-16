package com.mxk.java8.future.entity;

import java.math.BigDecimal;

/**
 * @ClassName Order
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/16 11:25
 **/
public class Order {

    private Integer id;
    private String orderName;
    private BigDecimal price;

    public Order(Integer id, String orderName, BigDecimal price) {
        this.id = id;
        this.orderName = orderName;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
