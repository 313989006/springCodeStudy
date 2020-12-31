package com.mxk.jvmdemo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName Finalization
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/11 12:30
 **/
public class Finalization {

    public static Finalization finalization;

    @Autowired
    public void finalize(){
        System.out.println("Finalized");
        finalization = this;
    }

    public static void main(String[] args) {
        Finalization f = new Finalization();
        System.out.println("First print : " + f);
        f = null;
        System.gc();
        System.out.println("Second print : " + f);
        System.out.println(f.finalization);

//        ReferenceQueue 引用队列
//        WeakReference  弱引用
    }
}
