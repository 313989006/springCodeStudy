package com.mxk.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/27 16:16
 **/
@Component
@ComponentScan("com.mxk")
@EnableAspectJAutoProxy
public class AppConfig {

}
