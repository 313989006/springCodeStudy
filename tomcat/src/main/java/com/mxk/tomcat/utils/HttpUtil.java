package com.mxk.tomcat.utils;

/**
 * @ClassName 封装好的http工具类
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/19 21:31
 **/
public class HttpUtil {

    public static  String getHttpResponseContext(int code,String content,String errorMsg){
        if (code == 200){
            return "HTTP/1.1 200 OK \n" + "Content-Type: text/html\n" + "\r\n" + content;
        } else if (code == 500){
            return "HTTP/1.1 500 Internal Error=" + errorMsg + "\n" + "Content-Type: text/html\n" + "\r\n";
        }

        return "HTTP/1.1 404 Not Found \n" + "\n" + "Content-Type: text/html\n" + "\r\n" + "<h1>404 not found</h1>";
    }

    public static String getHttpResponseContext404(){
        return "111";
    }

    public static String getHttpResponseContext200(String content){
        return content;
    }
}
