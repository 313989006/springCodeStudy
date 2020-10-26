package com.mxk.beanFactory;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @ClassName MxkScan
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/26 12:45
 **/
@Retention(RetentionPolicy.RUNTIME)
@Import(MxkImportBeanDefinitionRegistrar.class)
public @interface MxkScan {
}
