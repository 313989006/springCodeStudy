package com.mxk.mapper;

import com.mxk.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @InterfaceName BlogMapper
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/2/2 16:40
 **/
@Mapper
public interface BlogMapper {

  Blog selectBlog(@Param("id") Integer id);

//  @Select("select * from blog where id = #{id}")
//  Blog selectOneBlog(@Param("id") Integer id);
}
