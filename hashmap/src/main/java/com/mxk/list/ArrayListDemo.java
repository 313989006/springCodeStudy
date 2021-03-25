package com.mxk.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @ClassName ArrayListDemo
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/31 9:51
 **/
public class ArrayListDemo {

    public static void main(String[] args) {

        /**
        * ArrayList 如果插入元素的话，后面的元素位置要移位，所以插入慢
        */
        ArrayList arrayList = new ArrayList();  // 数组： 查询快，插入慢
        arrayList.add(3,new Object());    // 已经定位好了，直接插入


        LinkedList linkedList = new LinkedList();   // 链表： 查询慢，插入快
        linkedList.add(3,new Object());        // 定位，插入


    }
}
