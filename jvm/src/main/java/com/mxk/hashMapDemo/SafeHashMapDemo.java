package com.mxk.hashMapDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName SafeHashMapDemo
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/9 15:07
 **/
public class SafeHashMapDemo {

    /**
    * @Description: 把 HashMap 包装成线程安全的 Map
    * @Param:
    * @return:
    */
    public static void main(String[] args) {

        Map map = new HashMap();

        Map safeHashMap = Collections.synchronizedMap(map);
        safeHashMap.put("aa",1);
        safeHashMap.put("bb",2);
        System.out.println(safeHashMap.get("bb"));

    }


}
