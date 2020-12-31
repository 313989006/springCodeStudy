package com.mxk.jvmdemo;

/**
 * @ClassName JvmTest
 * @Description JVM 堆内存参数调休，修改 VM options 为：-Xms1024m -Xmx1024m -XX:+PrintGCDetails
 * @Author ma.kangkang
 * @Date 2020/11/28 18:52
 **/
public class JvmTest {

    public static void main(String[] args) {

        long maxMemory = Runtime.getRuntime().maxMemory();

        long totalMemory = Runtime.getRuntime().totalMemory();

        System.out.println("MAX MEMORY = " + maxMemory + " （字节）、" + (maxMemory / (double) 1024 / 1024) + "MB");
        System.out.println("TOTAL MEMORY = " + totalMemory + " （字节）、" + (totalMemory / (double) 1024 / 1024) + "MB");


    }
}
