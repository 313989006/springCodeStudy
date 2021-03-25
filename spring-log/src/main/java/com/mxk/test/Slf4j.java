package com.mxk.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName Slf4j
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/3/25 20:55
 **/
public class Slf4j {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("slf4j");
        logger.info("slf4j----");
    }
}
