package com.mxk;

import javax.swing.table.TableRowSorter;

/**
 * @ClassName YeildDemo
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/28 22:19
 **/
public class YeildDemo {

    public static void main(String[] args) {
        Runnable yeildTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10 ; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                    if (i == 5){
                        Thread.yield();
                    }
                }
            }
        };

        Thread thread1 = new Thread(yeildTask,"A");
        Thread thread2 = new Thread(yeildTask,"B");
        thread1.start();
        thread2.start();

    }
}
