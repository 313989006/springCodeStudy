package com.mxk.tomcat.config;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ServletConfigMapping
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/20 10:55
 **/
public class ServletConfigMapping {

    private static List<ServletConfig> configs = new ArrayList<>();

    static {
        configs.add(
                new ServletConfig("MxkServlet","/mxk","com.mxk.tomcat.servlet.MxkServlet")
        );
    }

    public static List<ServletConfig> getConfigs(){
        return configs;
    }

}
