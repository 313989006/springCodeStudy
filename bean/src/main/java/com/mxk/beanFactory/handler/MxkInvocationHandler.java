package com.mxk.beanFactory.handler;

import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName MxkInvocationHandler
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/21 10:10
 **/
public class MxkInvocationHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 打印select语句
        System.out.println(method.getAnnotation(Select.class).value()[0]);
        // 打印参数
//        System.out.println(args[0]);
        System.out.println("参数为 ： ");
        return null;
    }
}
