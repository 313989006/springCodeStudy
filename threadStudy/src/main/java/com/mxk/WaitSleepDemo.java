package com.mxk;

/**
 *  wait 方法和 sleep 区别
 **/
public class WaitSleepDemo {

    public static void main(String[] args) {

        final Object lock = new Object();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread A 正在等待获取锁");
                synchronized (lock){
                    try {
                        System.out.println("thread A 获得锁");
                        Thread.sleep(20);
                        System.out.println("thread A 开始调用 wait 方法");
//                        lock.wait(1000);// 等待1秒
                        lock.wait();// 无限等待，需要被动被唤醒
                        System.out.println("thread A 执行完成");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread B 正在等待获取锁");
                synchronized (lock){
                    try {
                        System.out.println("thread B 获得锁");
                        System.out.println("thread B 睡眠10毫秒");
                        Thread.sleep(10);
                        System.out.println("thread B 执行完成");

                        lock.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
