package com.mxk.hashmapTest;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/18 13:52
 **/
public class Test1 {

    public static void main(String[] args) {
        int h;
        Object key = "abc";
        System.out.println(key.hashCode());
        h = key.hashCode();
        System.out.println("h 的值为：" + h);
        System.out.println(h >>> 16);
        System.out.println(h ^ (h >>> 16));
//        System.out.println((h = key.hashCode()) ^ (h >>> 16));
    }
}
