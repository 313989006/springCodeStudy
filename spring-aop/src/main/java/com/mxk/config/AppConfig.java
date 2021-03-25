package com.mxk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/10 10:26
 **/
@Configuration
@ComponentScan("com")
@EnableAspectJAutoProxy
public class AppConfig {
}
