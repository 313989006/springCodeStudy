package com.mxk.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Collections;
import java.util.Properties;

/**
 * @ClassName Consumer
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/1 15:11
 **/
public class Consumer {

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

        // 手动提交偏移量(关闭自动提交)
        properties.setProperty("enable.auto.commit","false");
//        properties.setProperty("auto.offset.reset","none");

        KafkaConsumer<String,String> consumer = new KafkaConsumer<String, String>(properties);

        consumer.subscribe(Collections.singletonList("test-topic"));

        /**
        *   什么时候用同步？什么时候用异步呢？
         *  可以同时使用
        */
//        // 同步提交偏移量：不建议同步提交，虽然可以重试，但是对性能有要求，影响 Kafka 吞吐量
//        consumer.commitSync();
//        // 异步提交偏移量：没有重试
//        consumer.commitAsync();

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
                // 异步提交偏移量：没有重试
                consumer.commitAsync();
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                // 手动提交一次
                consumer.commitSync();
            } catch (Exception e){
                e.printStackTrace();
            } finally {
                consumer.close();
            }
        }


    }
}
