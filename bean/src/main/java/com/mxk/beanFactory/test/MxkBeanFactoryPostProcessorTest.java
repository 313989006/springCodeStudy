package com.mxk.beanFactory.test;

import com.mxk.BeanApplication;
import com.mxk.bean.config.MxkConfig;
import com.mxk.component.entity.Person;
import com.mxk.component.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName MxkBeanFactoryPostProcessorTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/21 16:42
 **/
public class MxkBeanFactoryPostProcessorTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MxkConfig.class);
        // MxkBeanFactoryPostProcessor已经把Person中beanDefinition的beanClass改成User了，这里在getBean会报错
//        System.out.println(context.getBean(Person.class));
        // 如果将 MxkBeanFactoryPostProcessor 中beanDefinition.setBeanClass(User.class);注释掉，
        // 而且 User 类有没有用@Component注册到spring中，直接getBean(User.class)会报找不到User这个bean
        System.out.println(context.getBean(User.class));
    }
}
