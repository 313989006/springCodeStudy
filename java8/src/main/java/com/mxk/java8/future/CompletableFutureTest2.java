package com.mxk.java8.future;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName CompletableFutureTest2
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/16 10:24
 **/
public class CompletableFutureTest2 {

    public static void main(String[] args) throws InterruptedException {

        AtomicBoolean finished = new AtomicBoolean(false);
        CompletableFuture.supplyAsync(CompletableFutureTest::get).whenComplete((v,t)->{
            Optional.ofNullable(v).ifPresent(System.out::println);
            Optional.of(t).ifPresent(x-> x.printStackTrace());
            finished.set(true);
        });
        System.out.println("I am not blocked");
        while (!finished.get()){
            Thread.sleep(1);
        }
//        Thread.currentThread().join();
    }
}
