package com.mxk.java8.future;

import java.util.concurrent.*;

/**
 * @ClassName FutureTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/16 9:49
 **/
public class FutureTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 新建一个线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<?> future = executorService.submit(() -> {
            try {
                Thread.sleep(10000L);
                return "I am finished";
            } catch (InterruptedException e) {
                return "I am Error";
            }
        });
        // 返回Future 结果之前，可以执行线程自己的逻辑
        System.out.println("do my something");
        while (!future.isDone()){
            Thread.sleep(10);
        }
        System.out.println(future.get());
        // 关闭线程池，避免线程一直存在导致电脑卡死
        executorService.shutdown();
    }
}
