package com.mxk;

/**
 * @ClassName RunnableDemo
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/28 15:54
 **/
public class RunnableDemo {

    public static void main(String[] args) {

        MyRunnable runnable1 = new MyRunnable("runnable1");
        MyRunnable runnable2 = new MyRunnable("runnable2");
        MyRunnable runnable3 = new MyRunnable("runnable3");


        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        Thread thread3 = new Thread(runnable3);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
