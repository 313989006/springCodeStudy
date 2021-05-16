package com.mxk;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.Map;

/**
 * @ClassName MyPartitioner
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/2 14:44
 **/
public class MyPartitioner implements Partitioner {
    public int partition(String s, Object o, byte[] bytes, Object o1, byte[] bytes1, Cluster cluster) {

        System.out.println("使用了我们自己的分区管理器");
        if (bytes == null){
            return 0;
        } else {
            return 1;
        }
    }

    public void close() {

    }

    public void configure(Map<String, ?> map) {

    }
}
