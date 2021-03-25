package com.mxk.util;

import com.mxk.anno.UserEntity;
import com.mxk.entity.User;

import java.lang.annotation.Annotation;

/**
 * @ClassName CommonUtil
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/10 10:34
 **/
public class CommonUtil {

    public static String buildQueryForEntity(Object object){

        Class clazz = object.getClass();

        // 判断是否加了这个注解
        if (clazz.isAnnotationPresent(UserEntity.class)){
            // 得到注解
            UserEntity userEntity = (UserEntity) clazz.getDeclaredAnnotation(UserEntity.class);

            // 调用方法
            String entityName = userEntity.value();
            System.out.println(entityName);
        }
        String sql = "select * from ";

        return sql;

    }
}
