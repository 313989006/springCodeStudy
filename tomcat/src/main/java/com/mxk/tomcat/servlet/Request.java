package com.mxk.tomcat.servlet;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Request
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/19 21:52
 **/
public class Request {

    // 请求路径
    private String url;

    // 请求方法
    private String method;

    // 输入流
    private InputStream inputStream;


    /**
    * @Description: 构造方法，解析请求头，将请求头信息传到extractFileds方法，解析请求方法和请求url
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2020/10/20
    */
    public Request(InputStream inputStream) throws Exception {
        this.inputStream = inputStream;
        int count = 0;
        while (count == 0){
            count = inputStream.available();
        }
        // 定义字节
        // available 用于预估即将发过来的请求的字节流长度是多少
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes);
        // 将请求头信息传到extractFileds方法，解析请求方法和请求url
        extractFileds(new String(bytes));
    }

    /**
    * @Description: 解析请求方法和请求url
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2020/10/19
    */
    private void extractFileds(String content){
        if (content.equals("")) {
            System.out.println("empty");
        } else {
            String firstLine = content.split("\\n")[0];
            String[] str = firstLine.split("\\s");
            setUrl(str[1]);
            setMethod(str[0]);
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }
}
