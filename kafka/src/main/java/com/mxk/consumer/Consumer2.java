package com.mxk.consumer;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.*;

/**
 * @ClassName Consumer2
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/1 15:48
 **/
public class Consumer2 {

    public static void main(String[] args) {
        Properties properties = new Properties();

        // 集群 ip 和端口
        properties.setProperty("bootstrap.servers","127.0.0.1:9092");

        // key 反序列化器
        properties.setProperty("key.deserializer", StringDeserializer.class.getName());
        // value 反序列化器
        properties.setProperty("value.deserializer", StringDeserializer.class.getName());
        // 消费者群组
        properties.setProperty("group.id","111");

        // 消费者实例
        KafkaConsumer<String,String> consumer = new KafkaConsumer(properties);
        // 主题订阅
        consumer.subscribe(Collections.singletonList("test-topic"), new ConsumerRebalanceListener() {
            public void onPartitionsRevoked(Collection<TopicPartition> collection) {
                System.out.println("分区再均衡之前");
//                consumer.commitSync();
//                for (TopicPartition topicPartition : collection) {
//                    System.out.println("分区为：" + topicPartition.partition());
//                }
            }

            public void onPartitionsAssigned(Collection<TopicPartition> collection) {
                System.out.println("分区再均衡之后");
                for (TopicPartition topicPartition : collection) {
                    System.out.println("分区为：" + topicPartition.partition());
                }
            }
        });

        // 手动提交偏移量(关闭自动提交)
        properties.setProperty("enable.auto.commit","false");
        consumer.commitSync();

        Map<TopicPartition, OffsetAndMetadata> offsetAndMetadataMap = new HashMap<TopicPartition, OffsetAndMetadata>();
        offsetAndMetadataMap.put(new TopicPartition("test-topic",0),new OffsetAndMetadata(0,""));


        while (true){
            ConsumerRecords<String,String> records = consumer.poll(500);
            for (ConsumerRecord<String,String> record : records){
                System.out.println("key : " + record.key());
                System.out.println("value : " + record.value());
                System.out.println("offset : " + record.offset());
                System.out.println("partition : " + record.partition());
            }
        }
    }
}
