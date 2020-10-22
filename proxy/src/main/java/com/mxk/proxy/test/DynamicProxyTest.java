package com.mxk.proxy.test;

import com.mxk.proxy.dao.PersonDao;
import com.mxk.proxy.handler.MxkInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicProxyTest（JDK动态代理实现方式）
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/21 10:06
 **/
public class DynamicProxyTest {

    public static void main(String[] args) {

        // ************这里和Spring没有任何关系，单纯的使用JDK动态代理

        // PersonDao.class 加载类到jvm载入内存
        Class[] clazz = new Class[]{PersonDao.class};

        // 实例化类 | 通过JDK动态代理的方式（参数为：当前类的加载器，反射得到的clazz，InvocationHandler实例对象）
        PersonDao dao = (PersonDao) Proxy.newProxyInstance(DynamicProxyTest.class.getClassLoader(),
                clazz,new MxkInvocationHandler());

        dao.query("mxk");
    }
}
