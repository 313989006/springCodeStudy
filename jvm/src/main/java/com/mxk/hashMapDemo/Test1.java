package com.mxk.hashMapDemo;

/**
 * @ClassName Test1
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/4 17:17
 **/
/**
* HashMap 的特点：
 *  1、底层是哈希表，哈希表是一个数组，数组的每个元素是一个单项链表，如果单向链表中节点的数量超过8，会把单向链表转换成树形结构
 *  2、HashMap 底层数组的初始化容量：16
 *  3、HashMap的加载因子默认是：0.75
 *      加载因子的作用：当数组中元素的数量 > 数组长度 * 加载因子时，数组要扩容
 *  4、HashMap 底层数组的容量扩容时按 2 倍大小扩容。
*/
public class Test1 {


    public static void main(String[] args) {


        int a = 3;
        int b = a << 1;
        int c = a >> 1;
        System.out.println(b);
        System.out.println(c);
    }
}
