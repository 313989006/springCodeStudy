package com.mxk;

import java.util.HashSet;

/**
 *  求两个大V的共同粉丝
 *  1、Java 实现用 Set
 *
 *  2、Redis 里用的是 sinter 函数
 **/
public class SetTest {

    public static void main(String[] args) {

        //
        HashSet set1 = new HashSet();

        set1.add("xiaoming1");
        set1.add("xiaoming2");
        set1.add("xiaoming3");
        set1.add("xiaoming4");
        set1.add("xiaoming5");
        set1.forEach(item1->{
            System.out.println(item1);
        });
        System.out.println("=====================================");

        HashSet set2 = new HashSet();
        set2.add("xiaoming1");
        set2.add("xiaoming3");
        set2.add("xiaoming5");
        set2.add("xiaoming6");
        set2.forEach(item2->{
            System.out.println(item2);
        });
        System.out.println("=====================================");
        HashSet sameSet = new HashSet();
        sameSet.addAll(set1);
        sameSet.retainAll(set2);
        System.out.println(sameSet);
    }
}
