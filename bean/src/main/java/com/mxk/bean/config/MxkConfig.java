package com.mxk.bean.config;

import com.mxk.beanFactory.MxkImportBeanDefinitionRegistrar;
import com.mxk.beanFactory.MxkScan;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName ProxyConfig
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/21 11:34
 **/

@Configuration
@ComponentScan("com.mxk")
//@MapperScan("com.mxk.beanFactory.dao")
//// 使用@Import导入，Spring才认识MxkImportBeanDefinitionRegistrar
//@Import(MxkImportBeanDefinitionRegistrar.class)
@MxkScan
public class MxkConfig {
}
