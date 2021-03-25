package com.mxk.test;

import com.mxk.config.AppConfig;
import com.mxk.factoryBean.MxkFactoryBean;
import com.mxk.factoryBean.TemplateFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName FactoryBeanTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/11 9:41
 **/
public class FactoryBeanTest {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MxkFactoryBean mxkFactoryBean = (MxkFactoryBean) context.getBean("&mxkFactoryBean");
        TemplateFactoryBean templateFactoryBean = (TemplateFactoryBean)context.getBean("mxkFactoryBean");
        mxkFactoryBean.testBean();
        templateFactoryBean.test();
    }
}
