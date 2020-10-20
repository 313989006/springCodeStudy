package com.mxk.tomcat.config;

/**
 * @ClassName ServletConfig
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/20 10:54
 **/
public class ServletConfig {

    // Servlet名称
    private String name;

    // Servlet url映射
    private String urlMapping;

    // Servlet clazz
    private String clazz;

    /**
    * @Description: 构造方法
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2020/10/20
    */
    public ServletConfig(String name, String urlMapping, String clazz) {
        this.name = name;
        this.urlMapping = urlMapping;
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlMapping() {
        return urlMapping;
    }

    public void setUrlMapping(String urlMapping) {
        this.urlMapping = urlMapping;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }
}
