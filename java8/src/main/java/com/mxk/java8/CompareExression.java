package com.mxk.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName CompareExression
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/15 16:12
 **/
public class CompareExression {


    public static void main(String[] args) {

        /**
        * 根据颜色排序
        */
        Comparator<Apple> byColor = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getColor().compareTo(o2.getColor());
            }
        };
        List<Apple> list = Collections.emptyList();
        list.sort(byColor);

        Comparator<Apple> byColor2 = (o1, o2) -> o1.getColor().compareTo(o2.getColor());
        list.sort(byColor2);


    }
}
