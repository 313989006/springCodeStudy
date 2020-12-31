package com.mxk.jvmdemo;

import java.util.Random;

/**
 * @ClassName OutOfMemoryTest
 * @Description JVM 堆内存参数调休，修改 VM options 为：-Xms8m -Xmx8m -XX:+PrintGCDetails
 * @Author ma.kangkang
 * @Date 2020/11/29 10:17
 **/
public class OutOfMemoryTest {

    public static void main(String[] args) {

        String str = "www.mxk.com";
        int count = 0;
        try{
            while (true){
                str += str + new Random().nextInt(88888888) + new Random().nextInt(99999999);
                count ++;
            }
        } catch (Exception e){
            System.out.println("***********count = " + count + " *******");
            e.printStackTrace();
        }

    }
}
