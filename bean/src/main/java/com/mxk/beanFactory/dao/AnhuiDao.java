package com.mxk.beanFactory.dao;


import org.apache.ibatis.annotations.Select;

/**
* @Description: 省dao层（测试jdk动态代理）
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2020/10/21
*/
public interface AnhuiDao {

    @Select("select * from anhui")
    void query(String name);
}
