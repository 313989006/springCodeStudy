package com.mxk.test;

import com.mxk.dao.CardDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName MyFactorybean
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/17 15:22
 **/
//@Component
public class MyFactorybean implements FactoryBean, InvocationHandler {

    Class clazz;

    public MyFactorybean(Class clazz){
        this.clazz = clazz;
    }

//    @Override
    public Object getObject() throws Exception {
        Class[] clazzs = new Class[]{clazz};
        Object proxy = Proxy.newProxyInstance(this.getClass().getClassLoader(),clazzs,this);
        return proxy;
    }

//    @Override
    public Class<?> getObjectType() {
        return clazz;
    }

//    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy");
        return null;
    }
}
