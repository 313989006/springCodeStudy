package com.mxk.config;

import org.apache.ibatis.logging.log4j.Log4jImpl;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/26 10:10
 **/
@Configuration
@ComponentScan("com.mxk")
@MapperScan("com.mxk.mapper")
public class AppConfig {

    @Bean
    @Autowired
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource source){
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(source);;

//        org.apache.ibatis.session.Configuration configuration  = new org.apache.ibatis.session.Configuration();
//        configuration.setLogImpl(Log4jImpl.class);
//        sessionFactoryBean.setConfiguration(configuration);
        return  sessionFactoryBean;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Root-123");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?useUnicode=true&characterEncoding=utf-8&nullCatalogMeansCurrent=true&serverTimezone=Asia/Shanghai");
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return driverManagerDataSource;
    }
}
