package com.mxk.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName FilterAppleList
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/15 15:34
 **/
public class FilterApple {

    @FunctionalInterface
    public interface AppleFilter{
        boolean filter(Apple apple);
    }

    public static List<Apple> findApple(List<Apple> apples,AppleFilter appleFilter){
        List<Apple> appleList = new ArrayList<>();
        for (Apple apple : apples) {
            if (appleFilter.filter(apple)){
                appleList.add(apple);
            }
        }
        return appleList;
    }

    public static List<Apple> findGreenApple(List<Apple> apples){
        List<Apple> appleList = new ArrayList<Apple>();

        for (Apple apple : appleList) {
            if ("green".equals(apple.getColor())){
                appleList.add(apple);
            }
        }
        return appleList;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green",150),new Apple("red",200),new Apple("yellow",300));
        List<Apple> greenApples = findGreenApple(list);

        List<Apple> lamdaResult = findApple(list,apple ->{
            return apple.getColor().equals("green");
        } );
    }
}
