package com.mxk.java8;

/**
 * @ClassName Apple
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/15 15:32
 **/
public class Apple {

    // 颜色
    private String color;

    // 重量
    private Integer weight;

    public Apple(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
