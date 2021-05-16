package com.mxk;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/28 15:18
 **/
public class MyThread extends Thread{

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public  void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread start :" + this.name + ",i=" + i);
        }
    }
}
