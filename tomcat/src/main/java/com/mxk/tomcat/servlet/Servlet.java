package com.mxk.tomcat.servlet;

/**
 * @ClassName Servlet
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/20 10:37
 **/
public abstract class Servlet {

    public void doGet(Request request, Response response){

    }

    public void doPost(Request request,Response response){

    }

    public void service(Request request, Response response){
        if ("GET".equals(request.getMethod())){
            doGet(request,response);
        } else {
            doPost(request,response);
        }
    }
}
