package com.mxk.tomcat.server;

import com.mxk.tomcat.config.ServletConfig;
import com.mxk.tomcat.config.ServletConfigMapping;
import com.mxk.tomcat.servlet.Request;
import com.mxk.tomcat.servlet.Response;
import com.mxk.tomcat.servlet.Servlet;
import com.mxk.tomcat.utils.HttpUtil;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MyTomcat
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/19 21:21
 **/
public class MyTomcat {

    private int port = 8088;

    /**
    * @Description: 无参构造方法
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2020/10/19
    */
    public MyTomcat(){ }

    /**
     * @Description: 有参构造方法
     * @Param:
     * @return:
     * @Author: ma.kangkang
     * @Date: 2020/10/19
     */
    public MyTomcat(int port){
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


    private Map<String,Class<Servlet>> stringClassMap = new HashMap();

    /**
    * @Description: 初始化servlet
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2020/10/20
    */
    public void initServlet() throws ClassNotFoundException {
        for (ServletConfig servletConfig : ServletConfigMapping.getConfigs()) {
            stringClassMap.put(servletConfig.getUrlMapping(), (Class<Servlet>) Class.forName(servletConfig.getClazz()));
        }
    }


    /**
    * @Description: 分发器方法
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2020/10/20
    */
    public void dispatch(Request request,Response response){
        Class<Servlet> servletClass = stringClassMap.get(request.getUrl());
        if (servletClass != null){
            Servlet servlet = null;
            try {
                servlet = servletClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            servlet.service(request,response);
        } else {
            response.write(HttpUtil.getHttpResponseContext404());
        }
    }

    /**
    * @Description: 启动方法
    * @Param:
    * @return:
    * @Author: ma.kangkang
    * @Date: 2020/10/19
    */
    public void start() throws Exception {
        initServlet();
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("MyTomcat start on : " + port);
        while (true){
            Socket socket = serverSocket.accept();

//            // 定义输入流
//            InputStream inputStream = socket.getInputStream();
//
//            // 定义count为0，读取请求的长度，如果为0，将继续读取
//            int count = 0;
//            while (count == 0){
//                count = inputStream.available();
//            }
//            // 定义字节
//            // available 用于预估即将发过来的请求的字节流长度是多少
//            byte[] bytes = new byte[inputStream.available()];
//            inputStream.read(bytes);
//            System.out.println(new String(bytes));

            Request request = new Request(socket.getInputStream());
            Response response = new Response(socket.getOutputStream());

            // 判断请求是不是存在/静态资源/正常请求
            if (request.getUrl().equals("/")){
                response.write(HttpUtil.getHttpResponseContext404());
            } else if (stringClassMap.get(request.getUrl()) == null){
                response.writeHtml(request.getUrl());
            } else {
                dispatch(request,response);
            }
            // 返回的是静态页面，改为上面的判断
//            response.writeHtml(request.getUrl());
//            socket.getOutputStream().write("hello world ".getBytes());
            socket.close();
        }
    }

    public static void main(String[] args) throws Exception {
        MyTomcat tomcat = new MyTomcat();
        tomcat.start();
    }
}
