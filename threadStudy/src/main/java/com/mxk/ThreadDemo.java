package com.mxk;

/**
 * @ClassName ThreadDemo
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/28 15:20
 **/
public class ThreadDemo {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread("thread1");
        MyThread thread2 = new MyThread("thread2");
        MyThread thread3 = new MyThread("thread3");

        /**
        * 三个线程是随机执行的
         * 不是顺序执行的
        */
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
