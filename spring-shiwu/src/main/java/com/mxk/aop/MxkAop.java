package com.mxk.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName MxkAop
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/27 16:20
 **/
@Component
@Aspect
public class MxkAop {

    @Pointcut("execution(* com.mxk.dao..*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(){
        System.out.println("target before");
    }
}
