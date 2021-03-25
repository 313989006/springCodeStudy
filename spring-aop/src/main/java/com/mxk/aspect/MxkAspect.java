package com.mxk.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * execution 和 within 的区别？
 * execution 定义的最小粒度是方法的参数类型，个数，返回类型，修饰符，包名，类名等
 * within 定义的最小粒度是 类
 **/
@Component
@Aspect
public class MxkAspect {

    @Pointcut("execution(* com.mxk.service.*.*(..))")
    public void pointCut(){

    }

    //    @Before("pointCut()")
    //    public void beforePointCut(){
    //        System.out.println("===========before===========");
    //    }

    @Pointcut("within(com.mxk.service.*)")
    public void pointCutWithin(){

    }



    @Before("pointCut()")
    public void beforePointCut(){
        System.out.println("===========before===========");
    }


    @After("pointCut()")
    public void afterPointCut(){
        System.out.println("===========after===========");
    }


}
