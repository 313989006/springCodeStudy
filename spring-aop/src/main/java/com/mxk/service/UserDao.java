package com.mxk.service;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/10 11:04
 **/
@Repository
public class UserDao {

    public void say() {
        System.out.println("=========hello=========");
    }

    public void cry() {
        System.out.println("=========cry=========");
    }
}
