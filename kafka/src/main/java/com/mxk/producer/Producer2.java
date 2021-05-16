package com.mxk.producer;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

/**
 * @ClassName Producer2
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/4/1 15:43
 **/
public class Producer2 {

    public static void main(String[] args) {

        Properties properties = new Properties();

        properties.setProperty("bootstrap.servers","127.0.0.1:9092");

        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        KafkaProducer<String,String> producer = new KafkaProducer<String, String>(properties);

        ProducerRecord<String,String> record = new ProducerRecord<String, String>("test-topic2","hello3","world3");

        // 同步的方式
//        producer.send(record);
        // 异步的方式
        producer.send(record, new Callback() {
            public void onCompletion(RecordMetadata recordMetadata, Exception e) {
                if (null != e){
                    e.printStackTrace();
                }
                if ( null != recordMetadata){
                    System.out.println(recordMetadata.offset());
                }
            }
        });
        producer.flush();
        producer.close();
    }
}
