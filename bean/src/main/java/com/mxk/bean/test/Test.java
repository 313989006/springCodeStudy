package com.mxk.bean.test;

import com.mxk.BeanApplication;
import com.mxk.bean.factoryBean.MxkFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName Test
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/21 14:25
 **/
public class Test {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanApplication.class);

        // 如果加&，获取的是MxkFactoryBean 类本身
        System.out.println(context.getBean("&mxkFactoryBean"));

        // 如果不加&，获取的是MxkFactoryBean 类里getObject方法返回的对象（这里getObject返回的是null）
        //@Override
        //    public Object getObject() throws Exception {
        //        return null;
        //    }
        System.out.println(context.getBean("mxkFactoryBean"));
    }
}
