package com.mxk.producer;


import com.mxk.MyPartitioner;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

/**
 * @ClassName Producer
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/1 15:04
 **/
public class Producer {

    public static void main(String[] args) {

        Properties properties = new Properties();
        // 集群的ip和端口
        properties.setProperty("bootstrap.servers","127.0.0.1:9092");

        // key 序列化器
        properties.setProperty("key.serializer",StringSerializer.class.getName());
        // value 序列化器
        properties.setProperty("value.serializer",StringSerializer.class.getName());

        properties.setProperty("partitioner.class", MyPartitioner.class.getName());
        KafkaProducer<String,String> producer = new KafkaProducer<String, String>(properties);

        ProducerRecord<String,String> record = new ProducerRecord<String,String>("test-topic",null,"hello0");
        ProducerRecord<String,String> record1 = new ProducerRecord<String,String>("test-topic","1","hello1");
        producer.send(record);
        producer.send(record1);
        producer.flush();
        producer.close();

        System.out.println("发送成功");
    }
}
