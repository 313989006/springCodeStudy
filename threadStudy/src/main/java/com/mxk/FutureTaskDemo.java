package com.mxk;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *  实现 Callable 接口的方式实现多线程
 **/
public class FutureTaskDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new MyCallable());

        new Thread(task).start();

        // 任务还没执行完成
        if (!task.isDone()){
            System.out.println("还未执行完成，请等待！");
        }
        System.out.println("返回 ：" + task.get());

    }
}
