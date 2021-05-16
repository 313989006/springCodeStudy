package com.mxk;

import java.util.concurrent.Callable;

/**
 * @ClassName MyCallable
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/28 16:19
 **/
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        String value = "test";
        System.out.println("Ready to work");
        // 业务逻辑
        Thread.currentThread().sleep(5000);
        System.out.println("task done ");
        return value;
    }
}
