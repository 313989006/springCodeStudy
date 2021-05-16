package com.mxk.java8.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @ClassName DateTest
 * @Description TODO
 * @Author ma.kangkang
 * @Date 2021/5/16 13:01
 **/
public class DateTest {

    // java8之前，多线程操作 SimpleDateFormat 可以会抛异常
    public static void main1(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{

                for (int j = 0; j < 1000; j++) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        Date date = sdf.parse("2021-07-08");
                        System.out.println(date);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalDate localDate = LocalDate.of(2021,2,3);
        String format = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format);

        String dateStr = "2020-12-07";
        LocalDate strLocalDate = LocalDate.parse(dateStr);
        System.out.println(strLocalDate);
    }
}
