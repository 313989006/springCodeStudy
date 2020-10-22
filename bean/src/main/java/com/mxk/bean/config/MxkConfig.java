package com.mxk.bean.config;

import com.mxk.beanFactory.MxkImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName ProxyConfig
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/21 11:34
 **/

@Configuration
//@ComponentScan("com.mxk.proxy")
// 使用@Import导入，Spring才认识MxkImportBeanDefinitionRegistrar
@Import(MxkImportBeanDefinitionRegistrar.class)
public class MxkConfig {
}
