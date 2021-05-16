package com.mxk.test;

import com.mxk.config.AppConfig;
import com.mxk.mapper.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MxkTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/26 9:58
 **/
public class MxkTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        BlogMapper mapper = context.getBean(BlogMapper.class);
        System.out.println(mapper.selectBlog(101));
        System.out.println(mapper.selectBlog(101));


        /**
        * 手动添加 Mapper 的情况下
         * 1、mybatis-config.xml 里不需要注入 BlogMapper / mybatis-config.xml
         * 2、BlogMapper 也不需要加 @Mapper 注解
         * 3、注释掉 pom.xml文件的 build标签
        */
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = null;
//        try {
//            inputStream = Resources.getResourceAsStream(resource);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = sessionFactory.openSession();
//        session.getConfiguration().addMapper(BlogMapper.class);
//        BlogMapper mapper = session.getMapper(BlogMapper.class);
//        System.out.println(mapper.selectBlog(101));
//        System.out.println(mapper.selectBlog(101));


    }
}
