package com.mxk.jvmdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName JvmBlockDemo
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2020/11/28 11:02
 **/
public class JvmBlockDemo {

    private static List<int[]> bigObj = new ArrayList<>();

    private static List<char[]> bigCharObj = new ArrayList<>();

    public static int[] generate1M(){
        return new int[1024 * 256 * 2];
    }

    public static char[] generate1MChar(){
        return new char[1024 * 1024];
    }

    public static void main(String[] args) {
        int i = 0;
        while (i < 1000){

        }
    }
}
