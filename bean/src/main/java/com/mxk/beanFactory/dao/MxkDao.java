package com.mxk.beanFactory.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface MxkDao {
    @Select("select * from mxk")
    public List<Map<String,String>> select();
}
