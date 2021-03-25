package com.mxk.factoryBean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * 如果一个类实现了 FactoryBean
 * 那么 Spring 容器当中存在两个对象
 * 一个是 getObject() 返回的对象
 * 还有一个是当前类的对象
 *
 * getObject() 返回的对象存的是当前类指定的名字
 *
 * 当前对象是 “&” + 当前类的名字（案例如 FactoryBeanTest 的 main 方法）
 * 比如 @Component("mxkFactoryBean") 拿到的对象是 getObject() 返回的 TemplateFactoryBean 对象
 * 而 @Component("&mxkFactoryBean") 拿到的是真正的 MxkFactoryBean 对象
 *
 **/
@Component("mxkFactoryBean")
public class MxkFactoryBean implements FactoryBean {

    public Object getObject() throws Exception {
        return new TemplateFactoryBean();
    }

    public Class<?> getObjectType() {
        return TemplateFactoryBean.class;
    }

    public boolean isSingleton() {
        return true;
    }

    public void testBean(){
        System.out.println("mxkFactoryBean");
    }
}
