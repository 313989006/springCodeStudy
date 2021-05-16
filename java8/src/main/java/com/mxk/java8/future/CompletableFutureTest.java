package com.mxk.java8.future;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @ClassName CompletedFutureTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/16 10:07
 **/
public class CompletableFutureTest {

    private final static Random RANDOM = new Random(System.currentTimeMillis());

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Double> completableFuture = new CompletableFuture<Double>();
        new Thread(()->{
            double v = get();
            completableFuture.complete(v);
        }).start();
        System.out.println("=====none block=====");
        // 异步等待
//        System.out.println(completableFuture.get());

        // 线程执行完成返回结果的时候，通知我
        completableFuture.whenComplete((v,t)->{
            Optional.ofNullable(v).ifPresent(System.out::println);
            Optional.ofNullable(t).ifPresent(x-> x.printStackTrace());
        });
    }

    static double get(){
        try {
            Thread.sleep(RANDOM.nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return RANDOM.nextDouble();
    }
}
