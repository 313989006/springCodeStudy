package com.mxk.beanFactory;

import com.mxk.bean.factoryBean.MxkFactoryBean;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName MxkImportBeanDefinitionRegistrar
 * @Description 注册器
 * @Author ma.kangkang
 * @Date 2020/10/21 17:08
 **/
public class MxkImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {


        // 扫描某个包下所有的类，比如dao包下的
        // 拿到List
        // for循环，把Dao添加到默认构造方法的参数，如：beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.mxk.beanFactory.dao.MxkDao");


        // 构建MxkFactoryBean
        BeanDefinitionBuilder definitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(MxkFactoryBean.class);
        BeanDefinitionBuilder definitionBuilder2 = BeanDefinitionBuilder.genericBeanDefinition(MxkFactoryBean.class);

        //得到一个beanDefinition
        AbstractBeanDefinition beanDefinition = definitionBuilder.getBeanDefinition();
        AbstractBeanDefinition beanDefinition2 = definitionBuilder2.getBeanDefinition();

        // 获取到当前beanDefinition即MxkFactoryBean中所有的构造方法的参数，默认是null，如果传过来的是哪个Dao层就传哪个Dao
        // 然后添加value为com.mxk.beanFactory.dao.MxkDao，就能够new出来，并且AutoWired
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.mxk.beanFactory.dao.MxkDao");
        beanDefinition2.getConstructorArgumentValues().addGenericArgumentValue("com.mxk.beanFactory.dao.AnhuiDao");

        // 用beanDefinition来注册一个名字为mxkFactoryBean的bean
        // 在MxkImportBeanDefinitionRegistrarTest里获取mxkFactoryBean就可以获取到
        registry.registerBeanDefinition("mxkFactoryBean",beanDefinition);

        registry.registerBeanDefinition("anhui",beanDefinition2);
    }
}
