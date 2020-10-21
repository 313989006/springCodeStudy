package com.mxk.proxy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
* @Description: 人员dao层（测试jdk动态代理）
* @Param:
* @return:
* @Author: ma.kangkang
* @Date: 2020/10/21
*/
@Mapper
public interface PersonDao {

    @Select("select * from person")
    void query(String name);

}
