package com.mxk.jvmdemo;

/**
 * @ClassName NomalObject
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/11 12:42
 **/
public class NomalObject {

    public String name;

    public NomalObject(String name){
        this.name = name;
    }

    @Override
    protected void finalize(){
        System.out.println("Finalizing obj " + name);
    }
}
