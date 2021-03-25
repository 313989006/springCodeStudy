package com.mxk.proxy.test;

import com.mxk.proxy.dao.UserDao;
import com.mxk.proxy.impl.UserDaoImpl;
import com.mxk.proxy.proxyExtends.LogUserProxy;
import com.mxk.proxy.proxyPoly.TimerUserProxy;

/**
 * @ClassName ProxyTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/20 13:49
 **/
public class ProxyTest {

    public static void main(String[] args) {
        // 静态代理之继承的方式，只能实现一个代理
        //UserDaoImpl 目标对象，LogUserProxy 代理对象
//        UserDaoImpl userDao = new LogUserProxy();
//        userDao.query("mxk");

        // 静态代理之聚合的方式，可以实现多个代理
        // UserDaoImpl 实现 UserDao，LogUserProxy、TimerUserProxy 也实现了 UserDao，重写query方法
        // UserDao 抽象对象，UserDaoImpl 目标对象，LogUserProxy 代理对象
        UserDao userDao = new UserDaoImpl();
        UserDao proxy1 = new com.mxk.proxy.proxyPoly.LogUserProxy(userDao);
        UserDao proxy2 = new TimerUserProxy(proxy1);
        proxy1.query("mxk");

    }
}
