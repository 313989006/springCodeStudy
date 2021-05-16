package com.mxk.java8.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * @ClassName AcumelatorRecursiveTask
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/16 9:07
 **/
public class AcumelatorRecursiveTask extends RecursiveTask {

    private final int start;
    private final int end;
    private final int[] data;

    private final int limit = 3;

    public AcumelatorRecursiveTask(int start, int end, int[] data) {
        this.start = start;
        this.end = end;
        this.data = data;
    }

    @Override
    protected Object compute() {
        return null;
    }
}
