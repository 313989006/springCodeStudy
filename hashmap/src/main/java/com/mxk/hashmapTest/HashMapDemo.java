package com.mxk.hashmapTest;

import java.util.HashMap;

/**
 * @ClassName HashMapDemo
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/18 10:19
 **/
/**
* HashMap 的特点：
 * 1、底层是哈希表，哈希表是一个数组，数组的每个元素是一个单项链表，如果单向链表中节点的数量超过8，会把单向链表转换成树形结构
 * 2、HashMap 底层数组的初始化容量：16
 * 3、HashMap的加载因子默认是：0.75
 *      加载因子的作用：当数组中元素的数量 > 数组长度 * 加载因子时，数组要扩容
 * 4、HashMap 底层数组的容量扩容时按 2 倍大小扩容。
 * 5、理想状态下，数组中的每个单向链表中节点的数量应该是平均分布的
 *      系统是根据 hash 值计算索引值，这个索引值应该是平均分布的
 *      如果数组的长度为 16，可以把  hash 值对 16 求余，把余数作为数组的下标
 *              (n - 1) & hash
*/
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
//        hashMap.put("zhangsan",66);
//        hashMap.put("zhangsan2",66);
//        hashMap.put("zhangsan3",66);
//        hashMap.put("zhangsan4",66);
//        hashMap.put("zhangsan5",66);
//        hashMap.put("zhangsan6",66);
//        hashMap.put("zhangsan7",66);
//        hashMap.put("zhangsan8",66);
//        hashMap.put("zhangsan9",66);
//        hashMap.put("zhangsan10",66);
//        hashMap.put("zhangsan11",66);
//        hashMap.put("zhangsan12",66);
//        // 初始大小为16，加载因子为 0.75，初始阈值 threshold 为 12 = 16 * 0.75
//        hashMap.put("zhangsan13",66);
//        hashMap.put("zhangsan14",66);
//        hashMap.put("zhangsan15",66);
//        hashMap.put("zhangsan16",66);
//        hashMap.put("zhangsan17",66);
//        hashMap.put("zhangsan18",66);
//        hashMap.put("zhangsan19",66);
//        hashMap.put("zhangsan20",66);
//        hashMap.put("zhangsan21",66);
//        hashMap.put("zhangsan22",66);
//        hashMap.put("zhangsan23",66);
//        hashMap.put("zhangsan24",66);
//        // 修改数组大小为32，加载因子为 0.75，阈值 threshold 为 24 = 32 * 0.75
//        hashMap.put("zhangsan25",66);

        // 这里系统会把 hashMap2 的容量调整为 32
        HashMap<String,Integer> hashMap2 = new HashMap<>(30);
        /**
        * 创建 HashMap 时，如果指定初始化容量，系统会自动调整为 2 的幂次方
         * 如果初始化容量为 17 ~ 31，系统会把初始化容量调整为 32
         * 如果初始化容量为 33 ~ 63，系统会把初始化容量调整为 64
        */
        hashMap2.put("abc",123);
        /**
        * 添加 <键，值>对时，根据 hash 值计算下标，算法为：
         * (n - 1) & hash       // 把 n - 1 的值和 hash 值按位与操作
         *
         * 当 n 的值为 16 时，n-1 的值为 15，对应的二进制为 0000 1111
         * 当 n 的值为 32 时，n-1 的值为 31，对应的二进制为 0001 1111
         * 当 n 的值为 64 时，n-1 的值为 63，对应的二进制为 0011 1111
         *
         * 如果把 n 的值调整为 2 的幂次方后，在计算数组下标时，实际上是把 hash 值的最后 四位/五位/六位 作为数组的下标
         * 可以快速计算出对应的数组的索引值
        */

    }
}
