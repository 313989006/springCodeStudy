package com.mxk.java8.future;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @ClassName CompletableFutureTest2
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/16 10:24
 **/
public class CompletableFutureTest3 {

    public static void main(String[] args)  {

        // 线程设置为非守护线程
        ExecutorService executor = Executors.newFixedThreadPool(2,r->{
           Thread t = new Thread(r);
           t.setDaemon(false);
           return t;
        });
        // 异步调用
        CompletableFuture.supplyAsync(CompletableFutureTest::get,executor)
                .thenApply(CompletableFutureTest3::multiply)
                .whenComplete((v,t)->{
            Optional.ofNullable(v).ifPresent(System.out::println);
            Optional.of(t).ifPresent(x-> x.printStackTrace());
        });
    }

    private static double multiply(double d) {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return d * 10d;
    }
}
