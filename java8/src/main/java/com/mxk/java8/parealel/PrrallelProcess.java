package com.mxk.java8.parealel;

import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @ClassName PrrallelProcess
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/15 19:16
 **/
public class PrrallelProcess {

    public static void main(String[] args) {
        // 普通累加方法
        long startTime1 = System.currentTimeMillis();
        long result = 0L;
        for (int i = 0; i < 100; i++) {
            result += i;
        }
        long endstartTime1 = System.currentTimeMillis();
        System.out.println("耗时：" + (endstartTime1 - startTime1));

        // Stream 串行方式累加方法
        long startTime2 = System.currentTimeMillis();
        Stream.iterate(1L,i-> i + 1).limit(100).reduce(0L,Long::sum);
        long endstartTime2 = System.currentTimeMillis();
        System.out.println("耗时：" + (endstartTime2 - startTime2));

        // Stream 并行方式累加方法
        long startTime3 = System.currentTimeMillis();
        Stream.iterate(1L,i-> i + 1).parallel().limit(100).reduce(0L,Long::sum);
        long endstartTime3 = System.currentTimeMillis();
        System.out.println("耗时：" + (endstartTime3 - startTime3));

        // Stream 并行方式累加方法2,将 Stream 返回的 Object 拆箱为 Long
        long startTime4 = System.currentTimeMillis();
        Stream.iterate(1L,i-> i + 1).mapToLong(Long::longValue).parallel().limit(100).reduce(0L,Long::sum);
        long endstartTime4 = System.currentTimeMillis();
        System.out.println("耗时：" + (endstartTime4 - startTime4));

        // LongStream 并行方式累加方法,循环100次，耗时2 ms
        long startTime5 = System.currentTimeMillis();
        LongStream.rangeClosed(1L,100).parallel().reduce(0L,Long::sum);
        long endstartTime5 = System.currentTimeMillis();
        System.out.println("耗时：" + (endstartTime5 - startTime5));
    }
}
