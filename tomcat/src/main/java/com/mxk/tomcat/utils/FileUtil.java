package com.mxk.tomcat.utils;

import java.io.*;

/**
 * @ClassName 封裝好的文件工具类
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/10/19 22:02
 **/
public class FileUtil {

    public static Boolean writeFile(InputStream inputStream, OutputStream outputStream){

        boolean success = true;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        try {
          bufferedInputStream = new BufferedInputStream(inputStream);
          bufferedOutputStream = new BufferedOutputStream(outputStream);
            bufferedOutputStream.write(HttpUtil.getHttpResponseContext404().getBytes());
            int count = 0;
            while (count == 0){
                count = inputStream.available();

            }
            int fileSize = inputStream.available();
            long written = 0 ;
            int byteSize = 1024;
            byte[] bytes = new byte[byteSize];
            while (written < fileSize){
                if (written + byteSize > fileSize){
                    byteSize = (int) (fileSize - written);
                    bytes = new byte[byteSize];

                }
                bufferedInputStream.read(bytes);
                bufferedOutputStream.write(bytes);
                bufferedOutputStream.flush();
                written += byteSize;
            }
            success = true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return success;
    }

    public static boolean writeFile(File file,OutputStream outputStream) throws FileNotFoundException {
        return writeFile(new FileInputStream(file),outputStream);
    }

    public static String getResourcePath(String path){
        String resource = FileUtil.class.getResource("/").getPath();
        return resource + "\\" + path;
    }

}
