package com.mxk.component.test;

import com.mxk.BeanApplication;
import com.mxk.component.entity.Person;
import com.mxk.component.entity.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description 测试 实体类是怎么被加载的
 * @Author ma.kangkang
 * @Date 2020/10/21 15:07
 **/
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanApplication.class);

        // Person加了@Component 注解，注入到 容器中，直接getBean就可以得到bean
        System.out.println(context.getBean(Person.class));

        // User 没有加@Component 注解，没有被注入到容器中，直接getBean就回报错找不到User
        // 报错：Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException:
        // No qualifying bean of type 'com.mxk.component.entity.User' available
        System.out.println(context.getBean(User.class));
    }
}
