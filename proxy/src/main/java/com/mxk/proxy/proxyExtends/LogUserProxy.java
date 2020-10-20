package com.mxk.proxy.proxyExtends;

import com.mxk.proxy.impl.UserDaoImpl;

/**
 * @ClassName LogUserProxy,动态代理之继承的方式
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/20 13:48
 **/
public class LogUserProxy extends UserDaoImpl {

    public void query(String name){
        System.out.println("log name = " + name);
        System.out.println("name is " + name);
    }
}
