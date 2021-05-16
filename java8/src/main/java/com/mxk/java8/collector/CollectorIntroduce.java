package com.mxk.java8.collector;

import com.mxk.java8.Apple;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @ClassName CollectorIntroduce
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/15 16:36
 **/
public class CollectorIntroduce {

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(
                new Apple("red",100)
                ,new Apple("green",200)
                ,new Apple("yellow",300)
                ,new Apple("red",150)
                ,new Apple("red",170)
                ,new Apple("yellow",200));
        // 获取红色的苹果
        List<Apple> result = apples.stream().filter(v->{
            return v.getColor().equals("red");
        }).collect(Collectors.toList());
        List<Apple> result2 = apples.stream().filter(v-> v.getColor().equals("red")).collect(Collectors.toList());
        System.out.println(result);
        System.out.println(result2);

        System.out.println("==========================================================");

        // 根据颜色分组
        Map<String,List<Apple>> collectorResult = apples.stream().collect(Collectors.groupingBy(Apple::getColor));
        System.out.println(collectorResult);
        System.out.println(collectorResult.get("red").size());
        System.out.println(collectorResult.get("green").size());
        System.out.println(collectorResult.get("yellow").size());

        System.out.println("==========================================================");
        // 根据颜色排序
        apples.sort(Comparator.comparing(Apple::getColor));
        System.out.println(apples);
        System.out.println("==========================================================");
        // 根据颜色排序--倒序
        apples.sort((p1,p2)-> p2.getColor().compareTo(p1.getColor()));
        System.out.println(apples);
        System.out.println("==========================================================");
        // 根据重量排序--正序
        apples.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(apples);
        System.out.println("==========================================================");
        // 根据重量排序--倒序
        apples.sort(Comparator.comparing(Apple::getWeight).reversed());
        System.out.println(apples);
        System.out.println("************************************************");
        // 求重量的平均值
        Optional.ofNullable(apples.stream().collect(Collectors.averagingDouble(Apple::getWeight))).ifPresent(System.out::println);
        System.out.println("************************************************");
        // 求重量的平均值
        Optional.ofNullable(apples.stream().collect(Collectors.averagingInt(Apple::getWeight))).ifPresent(System.out::println);
        System.out.println("************************************************");
        // 求重量的平均值
        Optional.ofNullable(apples.stream().collect(Collectors.averagingLong(Apple::getWeight))).ifPresent(System.out::println);
        System.out.println("------------------------------------------------");
        // 求重量的平均值,然后返回一个字符串
        String str = apples.stream().collect(Collectors.collectingAndThen(Collectors.averagingInt(Apple::getWeight)
                ,a->"the average weight  ->" + a));
        System.out.println(str);
        System.out.println("------------------------------------------------");
        // 过滤之后不让修改
        List<Apple> appleList = apples.stream().filter(v->v.getColor().equals("red"))
                .collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));
//        appleList.add(new Apple("blue",200));// 会报错
//        appleList.add(new Apple("red",200));// 会报错
        System.out.println(appleList);

        System.out.println("################################################");
        // 统计
//        apples = new ArrayList<>();
//        Optional.ofNullable(apples.stream().collect(Collectors.counting())).ifPresent(System.out::println);
        Long count = apples.stream().collect(Collectors.counting());
        System.out.println(count);

        System.out.println("################################################");
        // 计算分组之后每个组的数量
        Optional.ofNullable(apples.stream().collect(Collectors.groupingBy(Apple::getColor,Collectors.counting()))).ifPresent(System.out::println);

        System.out.println("################################################");
        // 修改返回Map 的类型
        Map m = apples.stream().collect(Collectors.groupingBy(Apple::getColor,Collectors.counting()));
        System.out.println(m.getClass());
        Map m2 = apples.stream().collect(Collectors.groupingBy(Apple::getColor,TreeMap::new,Collectors.counting()));
        System.out.println(m2.getClass());

        System.out.println("################################################");
        // 统计计算用，返回 IntSummaryStatistics{count=6, sum=1120, min=100, average=186.666667, max=300}
        IntSummaryStatistics statisticsResult = apples.stream().collect(Collectors.summarizingInt(Apple::getWeight));
        Optional.ofNullable(statisticsResult).ifPresent(System.out::println);


    }

}
