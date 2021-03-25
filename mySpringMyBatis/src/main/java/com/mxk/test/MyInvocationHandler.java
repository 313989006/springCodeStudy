package com.mxk.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName MyInvocationHandler
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/17 15:04
 **/
public class MyInvocationHandler implements InvocationHandler {

//    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("******");
        return null;
    }
}
