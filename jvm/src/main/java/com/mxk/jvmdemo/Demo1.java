package com.mxk.jvmdemo;

/**
 * @ClassName Demo1
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/11/28 14:33
 **/
public class Demo1 {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Demo1 demo = new Demo1();
        System.out.println(demo.getClass().getClassLoader().getParent().getParent());
        System.out.println(demo.getClass().getClassLoader().getParent());
        System.out.println(demo.getClass().getClassLoader());
    }
}

