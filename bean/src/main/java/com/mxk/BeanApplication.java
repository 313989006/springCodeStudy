package com.mxk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mxk")
public class BeanApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanApplication.class, args);
    }

}
