package com.mxk.proxy.proxyPoly;

import com.mxk.proxy.dao.UserDao;

/**
 * @ClassName LogUserProxy,动态代理之继承的方式
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/20 13:48
 **/
public class TimerUserProxy implements UserDao {

    private UserDao userDao;

    public TimerUserProxy(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void query(String name){
        System.out.println("timer ...");
        userDao.query(name);
    }
}
