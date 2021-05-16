package com.mxk.java8.forkjoin;

/**
 * @ClassName ForkJoinPoll
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/16 9:04
 **/
public class ForkJoinPoll {

    private static int[] data = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        System.out.println("result = " + calc());
    }

    public static int calc(){
        int result = 0;
        for (int i = 0; i < data.length; i++) {
            result += data[i];
        }
        return result;
    }
}
