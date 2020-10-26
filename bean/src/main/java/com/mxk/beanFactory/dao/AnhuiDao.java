package com.mxk.beanFactory.dao;


import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
* @Description: 省dao层（测试jdk动态代理）
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2020/10/21
*/
public interface AnhuiDao {

    @Select("select * from anhui")
    List<Map<String,String>> query();
}
