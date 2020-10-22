package com.mxk.beanFactory.dao;


import org.apache.ibatis.annotations.Select;

/**
* @Description: 省dao层（测试jdk动态代理）
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2020/10/21
*/
public interface ChongqingDao {

    @Select("select * from chongqing")
    void query(String name);
}
