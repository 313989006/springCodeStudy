package com.mxk.jvmdemo;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/**
 * @ClassName ReferenceQueueTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/11 13:45
 **/
public class ReferenceQueueTest {

    private static ReferenceQueue<NomalObject> rq = new ReferenceQueue<NomalObject>();

    private static void checkQueue(){
        Reference<NomalObject> ref = null;
        while ((ref = (Reference<NomalObject>)rq.poll()) != null){
            if (ref != null){
                System.out.println("In Queue :" + ((NomalObjectWeakReference)(ref)).name);
                System.out.println("reference object ：" + ref.get());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<WeakReference<NomalObject>> weakList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            weakList.add(new NomalObjectWeakReference(new NomalObject("weak " + i),rq));
            System.out.println("Created Weak :" + weakList.get(i));
        }
        System.out.println("first time");
        checkQueue();
        System.gc();
        try {
            Thread.currentThread().sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("second time");
        checkQueue();

    }

}
