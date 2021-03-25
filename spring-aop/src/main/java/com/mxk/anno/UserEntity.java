package com.mxk.anno;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 当 Retention 值为 RUNTIME 时，才能CommonUtil 才能正常获取到 UserEntity 注解的值
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserEntity {


    String value() default "";
}
