package com.mxk;

/**
 * @ClassName MyRunnable
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/28 15:51
 **/
public class MyRunnable implements Runnable{

    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread start :" + this.name + ",i=" + i);
        }
    }

//    @Override

}
