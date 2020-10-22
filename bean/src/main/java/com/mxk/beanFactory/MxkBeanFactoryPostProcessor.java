package com.mxk.beanFactory;

import com.mxk.component.entity.Person;
import com.mxk.component.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @ClassName MxkBeanFactoryPostProcessor
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/21 16:36
 **/
@Component
public class MxkBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    // BeanFactoryPostProcessor : bean工厂的bean属性处理容器，说通俗一些就是可以管理我们的bean工厂内所有的beandefinition（未实例化）数据，可以随心所欲的修改属性。
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("person");
//        System.out.println("old" + beanDefinition.getBeanClass().getSimpleName());
        beanDefinition.setBeanClass(User.class);
//        System.out.println("new" + beanDefinition.getBeanClass().getSimpleName());
    }
}
