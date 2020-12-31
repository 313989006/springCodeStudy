package com.mxk.jvmdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName JvmTest2
 * @Description JVM 堆内存参数调休，修改 VM options 为：-Xms8m -Xmx8m -XX:+PrintGCDetails
 * 生成 OutOfMemoryError 的 Dump 日志文件，并分析
 * @Author ma.kangkang
 * @Date 2020/11/29 10:36
 **/
public class JvmTest2 {

    Byte[] bytes = new Byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        List<JvmTest2> list = new ArrayList<JvmTest2>();

        int count = 0;
        try {
            while (true){
                list.add(new JvmTest2());
                count ++;
            }
        }
        // Exception 抓取不到 java.lang.OutOfMemoryError: Java heap space 异常
        catch (Exception e){
            System.out.println("***********count = " + count + " *******");
            e.printStackTrace();
        }
        // Throwable 可以抓取到 java.lang.OutOfMemoryError: Java heap space 异常
        catch (Throwable throwable){
            System.out.println("***********count = " + count + " *******");
            System.out.println(throwable.getStackTrace());
        }


    }

}
