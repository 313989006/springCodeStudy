package com.mxk.hashmapTest;


import java.util.concurrent.ConcurrentHashMap;

/**
 *  JDK 1.8
 *
 *  数据结构：数组 + 链表 + 红黑树
 *
 *  链表长度大于8、且总节点数要大于64，系统会自动将链表转成红黑树（TREEIFY_THREDHOLD = 8，MIN_TREEIFY_CAPACITY = 64）
 *  左旋右旋 做成平衡二叉树
 *
 *  每个Node节点插入数据的时候加锁 synchronized
 *  转红黑树的时候，也在Node节点加锁 synchronized
 *
 *
 *
 *
 *
 *
 **/
public class CurrentHashMapDemo {

    public static void main(String[] args) {

        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("1","张三");
//        map.put("56","李四");
//        System.out.println("1".hashCode()%16);

//        System.out.println("56".hashCode()%16);
        // 测试是否能put null值
        // ConcurrentHashMap 不支持put 空的键值对（键不能为null，值也不能为null）
        // if (key == null || value == null) throw new NullPointerException();
//        map.put(null,"wangwu");

//        for(;;) 的用法：无线循环
//        int count = 0;
//        for (;;){
//            count++;
//            System.out.println(count);
//            if (count == 10000){
//                break;
//            }
//        }

    }
}
