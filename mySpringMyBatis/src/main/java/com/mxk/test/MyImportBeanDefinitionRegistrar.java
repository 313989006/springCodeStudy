package com.mxk.test;

import com.mxk.dao.CardDao;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;


/**
 * @ClassName MyImportBeanDefinitionRegistrar
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/17 15:10
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

//    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        System.out.println("-----");

//        CardDao cardDao =
//                (CardDao) Proxy.newProxyInstance(MyImportBeanDefinitionRegistrar.class.getClassLoader(),new Class[]{CardDao.class},new MyInvocationHandler());
//        cardDao.list("aaa");
        // 1、得到 bd，扫描所有接口（这里是写死的）
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(CardDao.class );
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) builder.getBeanDefinition();

        System.out.println(beanDefinition.getBeanClassName());
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.mxk.dao.CardDao");
        beanDefinition.setBeanClass(MyFactorybean.class);
        beanDefinitionRegistry.registerBeanDefinition("cardDao",beanDefinition);

    }
}
