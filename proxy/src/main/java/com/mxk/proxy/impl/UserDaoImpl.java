package com.mxk.proxy.impl;

import com.mxk.proxy.dao.UserDao;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/20 13:47
 **/
public class UserDaoImpl implements UserDao {

    public void query(String name){
        System.out.println("name is " + name);
    }
}
