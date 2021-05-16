package com.mxk.consumer;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.*;

/**
 * @ClassName Consumer
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/1 15:11
 **/
public class ConsumerBalance {

    public static void main(String[] args) {


        Properties properties = new Properties();
        // 集群的ip和端口
        properties.setProperty("bootstrap.servers","127.0.0.1:9092");

        // key 反序列化器
        properties.setProperty("key.deserializer", StringDeserializer.class.getName());
        // value 反序列化器
        properties.setProperty("value.deserializer",StringDeserializer.class.getName());

        // 定义消费者群组
        properties.setProperty("group.id","111");
        KafkaConsumer<String,String> consumer = new KafkaConsumer<String, String>(properties);
        consumer.subscribe(Collections.singletonList("test-topic"), new ConsumerRebalanceListener() {
            public void onPartitionsRevoked(Collection<TopicPartition> collection) {
                System.out.println("分区再均衡之前");
//                consumer.commitSync();
            }

            public void onPartitionsAssigned(Collection<TopicPartition> collection) {
                System.out.println("分区再均衡之后");
                for (TopicPartition topicPartition : collection) {
                    System.out.println("新分配的分区为：" + topicPartition.partition());
                }
            }
        });
        // 手动提交偏移量(关闭自动提交)
        properties.setProperty("enable.auto.commit","false");
//        properties.setProperty("auto.offset.reset","none");





        /**
        *   什么时候用同步？什么时候用异步呢？
         *  可以同时使用
        */
//        // 同步提交偏移量：不建议同步提交，虽然可以重试，但是对性能有要求，影响 Kafka 吞吐量
//        consumer.commitSync();
//        // 异步提交偏移量：没有重试
//        consumer.commitAsync();
        Map<TopicPartition, OffsetAndMetadata> offsetAndMetadataMap = new HashMap<TopicPartition, OffsetAndMetadata>();
        offsetAndMetadataMap.put(new TopicPartition("test-topic",1),new OffsetAndMetadata(0,""));
        try{
            while (true){
                ConsumerRecords<String, String> records = consumer.poll(500);



                for (ConsumerRecord<String, String> record : records){
                    System.out.println("key : " + record.key());
                    System.out.println("value : " + record.value());
                    System.out.println("offset : " + record.offset());
                    System.out.println("partition : " + record.partition());

                    System.out.println("处理消费到的消息逻辑");
                }
//                // 异步提交偏移量：没有重试
//                consumer.commitAsync();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
//            try {
//                // 手动提交一次
//                consumer.commitSync();
//            } catch (Exception e){
//                e.printStackTrace();
//            } finally {
//                consumer.close();
//            }
        }


    }
}
