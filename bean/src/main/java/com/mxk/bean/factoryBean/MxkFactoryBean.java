package com.mxk.bean.factoryBean;

import com.mxk.beanFactory.dao.MxkDao;
import com.mxk.beanFactory.handler.MxkInvocationHandler;
import com.mxk.beanFactory.test.MxkImportBeanDefinitionRegistrarTest;
import com.mxk.component.entity.Mxk;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @ClassName MxkFactoryBean
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/21 14:17
 **/
@Component
public class MxkFactoryBean implements FactoryBean {

    // 项目中会有多个Dao，怎么办呢？
    Class clazz;

    public MxkFactoryBean(Class clazz){
        this.clazz = clazz;
    }


    @Override
    public Object getObject() throws Exception {

//        // 实例化单个Dao的时候，第一种使用MxkDao
//        Class[] clazzes = new Class[]{MxkDao.class};
//        // MxkInvocationHandler 实现了MxkDao的query()
//        MxkDao dao = (MxkDao) Proxy.newProxyInstance(MxkImportBeanDefinitionRegistrarTest.class.getClassLoader(),
//                clazzes, new MxkInvocationHandler());
//        // 返回代理类
//        return dao;
//        // 实例化单个Dao的时候，第二种使用直接new一个Mxk类
////        return new Mxk();

        // 实例化多个Dao的时候
        Class[] clazzes = new Class[]{clazz};
        // MxkInvocationHandler 实现了MxkDao的query()
        Object dao = Proxy.newProxyInstance(MxkImportBeanDefinitionRegistrarTest.class.getClassLoader(),
                clazzes, new MxkInvocationHandler());
        // 返回代理类
        return dao;
    }

    @Override
    public Class<?> getObjectType() {
//        // 实例化单个Dao的时候，第一种使用MxkDao
//        return MxkDao.class;
//        // 实例化单个Dao的时候，第二种使用直接new一个Mxk类
////        return Mxk.class;

        // 实例化单个Dao的时候，第一种使用MxkDao
        return clazz;
    }
}
