package com.mxk.tomcat.servlet;

import com.mxk.tomcat.utils.HttpUtil;

/**
 * @ClassName MxkServlet自己的servlet，实现Servlet类
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/20 10:44
 **/
public class MxkServlet extends Servlet {

    @Override
    public void doGet(Request request,Response response){
        String content = "<h1>this is GET request</h1>";
        response.write(HttpUtil.getHttpResponseContext200(content));
    }

    @Override
    public void doPost(Request request,Response response){
        String content = "<h1>this is POST request</h1>";
        response.write(HttpUtil.getHttpResponseContext200(content));
    }

}
