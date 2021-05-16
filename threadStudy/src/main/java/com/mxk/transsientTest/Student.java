package com.mxk.transsientTest;

import java.io.Serializable;

/**
 *  被 transient 修饰的属性，是不会被序列化的
 *  序列化对象的时候，这个属性就不会序列化到指定的目的地中
 *  这个字段的生命周期仅存于调用者的内存中而不会写到磁盘里持久化。
 **/
public class Student implements Serializable {

    private transient String name;

    private int age;

    public Student() {

    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "age=" + age + ", name='" + name + '\'' + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
