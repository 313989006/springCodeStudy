package com.mxk.beanFactory.test;

import com.mxk.BeanApplication;
import com.mxk.bean.config.MxkConfig;
import com.mxk.beanFactory.service.MxkService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName MxkImportBeanDefinitionRegistrarTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/21 17:21
 **/
public class MxkImportBeanDefinitionRegistrarTest {

    public static void main(String[] args) {

        // 这里就是在构建Spring的bean工厂
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MxkConfig.class);

//        System.out.println(context.getBean("mxkFactoryBean"));

        MxkService mxkService = context.getBean(MxkService.class);
        mxkService.select();
    }
}
