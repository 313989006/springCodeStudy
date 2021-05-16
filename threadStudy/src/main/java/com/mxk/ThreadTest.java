package com.mxk;

/**
 * 调用start（）方法会创建一个新的线程并启动
 *  调用 run（）方法只是 Thread 的简单的方法调用
 **/
public class ThreadTest {

    private static void attack(){
        System.out.println("Fight");
        // 如果调用 run ，当前线程是 main 线程,不会创建新的线程
        // 如果调用 start ，当前线程是 Thread-0 线程
        System.out.println("当前线程名字：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(){
            public void run(){
//                attack();
                System.out.println("===============================：" + Thread.currentThread().getName());
            }
        };
//        thread.run();
        thread.start();

        /**
        * 验证 thread.start();执行 run 方法是在 main 线程执行完才执行
         * 结果是 新开的线程执行是随机的，可能在 main 线程执行中或者 main 线程执行完成后 执行
        */
        for (int i = 0; i < 10000; i++) {
            System.out.println("当前线程名字是：" + Thread.currentThread().getName() + i);
        }

    }
}
