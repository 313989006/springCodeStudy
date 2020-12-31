package com.mxk.jvmdemo;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 * @ClassName NomalObjectWeakReference
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/11 12:44
 **/
public class NomalObjectWeakReference extends WeakReference {

    public String name ;

    public NomalObjectWeakReference(NomalObject nomalObject, ReferenceQueue<NomalObject> referenceQueue){
        super(nomalObject,referenceQueue);
        this.name = nomalObject.name;
    }

    @Override
    protected void finalize(){
        System.out.println("Finalizing NomalObjectWeakReference " + name);
    }

}
