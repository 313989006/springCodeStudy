package com.mxk.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName ListDemo
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/12/21 16:23
 **/
public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Collection<String> strings = Collections.synchronizedCollection(list);

        List<String> list2 = new CopyOnWriteArrayList();

    }
}
