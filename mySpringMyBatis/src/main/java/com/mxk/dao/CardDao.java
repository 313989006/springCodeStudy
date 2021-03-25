package com.mxk.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @InterfaceName CardDao
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/17 14:26
 **/
public interface CardDao {

    @Select("select * from test where name= '%${name}'")
    public List<Map<Integer,String>> list(@Param("name")String name);
}
