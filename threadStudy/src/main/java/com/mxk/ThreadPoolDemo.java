package com.mxk;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @ClassName ThreadPollDemo
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/28 21:20
 **/
public class ThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();

        Future<String> future = newCachedThreadPool.submit(new MyCallable());

        if (!future.isDone()){
            System.out.println("还未执行完成，请等待！");
        }

        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            newCachedThreadPool.shutdown();
        }

    }
}
