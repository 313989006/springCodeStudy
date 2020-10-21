package com.mxk.proxy.proxyPoly;

import com.mxk.proxy.dao.UserDao;

/**
 * @ClassName LogUserProxy,动态代理之聚合的方式
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/20 13:48
 **/
public class LogUserProxy implements UserDao {

    private UserDao userDao;

    public LogUserProxy(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void query(String name){
        System.out.println("log ...");
        userDao.query(name);
    }
}
