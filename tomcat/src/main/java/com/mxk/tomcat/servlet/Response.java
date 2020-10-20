package com.mxk.tomcat.servlet;

import com.mxk.tomcat.utils.FileUtil;
import com.mxk.tomcat.utils.HttpUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @ClassName Response
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/19 22:00
 **/
public class Response {

    private OutputStream outputStream;

    public Response(OutputStream outputStream){
        this.outputStream = outputStream;
    }

    public void write(String content){
        try {
            outputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeHtml(String path) throws FileNotFoundException {
        String resourcePath = FileUtil.getResourcePath(path);
        File file = new File(resourcePath);
        if (file.exists()){
            FileUtil.writeFile(file, outputStream);
        } else {
            HttpUtil.getHttpResponseContext404();
        }
    }
}
