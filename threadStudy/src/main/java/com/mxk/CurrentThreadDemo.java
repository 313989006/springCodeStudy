package com.mxk;

/**
 * 获取当前线程的名字
 **/
public class CurrentThreadDemo {

    public static void main(String[] args) {
        System.out.println("当前线程名字：" + Thread.currentThread().getName());
    }
}
