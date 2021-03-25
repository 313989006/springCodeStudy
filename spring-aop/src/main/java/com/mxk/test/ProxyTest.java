package com.mxk.test;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 证明 JDK 动态代理是基于聚合（接口）的，
 * 因为JDK 底层源码自动把目标对象继承了 Proxy 类，
 * java是单继承，不可能再继承一个目标对象，所以只能实现目标对象的接口来实现
 **/
public class ProxyTest {

    public static void main(String[] args) {


//        File file = new File("d:\\Test.class");
//        // 接口的集合，需要传到Proxy.newProxyInstance
//        Class<?>[] clazz = new Class[]{UserService.class};
//
//        byte bytes[] = ProxyGenerator.generateProxyClass("userService",clazz);
//
//        try {
//            FileOutputStream fw = new FileOutputStream(file);
//            fw.write(bytes);
//
//            fw.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
