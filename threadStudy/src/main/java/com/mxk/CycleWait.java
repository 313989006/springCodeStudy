package com.mxk;

/**
 * 主线程等待法
 *  while 一直等待，直到返回了值不为 null
 **/
public class CycleWait implements Runnable{

    private String value;

    @Override
    public void run() {

        try {
            Thread.currentThread().sleep(5000);
        } catch (Exception e){
            e.printStackTrace();
        }
        value = "we have data now";
    }

    public static void main(String[] args) throws InterruptedException {

        CycleWait cw = new CycleWait();

        Thread thread = new Thread(cw);
        thread.start();
//        while (cw.value == null){
//            Thread.currentThread().sleep(100);
//        }
        thread.join();
        System.out.println("value : " + cw.value);

    }
}
