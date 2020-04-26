package com.miracle.jdk8study.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-09 08:11
 */
public class DateTest {
    public static void main(String[] args) throws Exception {
//        testLocalDate();
//        testLocalTime();
//        testCombineLocalDateWithLocalTime();
//        testInstant();
        testDateTimeFormate();
    }

    /**
     * 两个不足：
     * 1、Date 日期需要加1900才能到具体年限
     * 2、在多线程的情况下回出现线程问题
     *
     * @throws ParseException
     */
    public void testBeforeDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = simpleDateFormat.parse("20180520");
        int year = date.getYear();
        System.out.println(year + 1900);
    }

    public static void testLocalDate() {
        LocalDate date = LocalDate.of(2020, 4, 9);
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
    }

    public static void testLocalTime() {
        LocalTime localTime = LocalTime.now();
        Optional.ofNullable(localTime.getHour()).ifPresent(System.out::println);
        Optional.ofNullable(localTime.getMinute()).ifPresent(System.out::println);
        Optional.ofNullable(localTime.getSecond()).ifPresent(System.out::println);
        Optional.ofNullable(localTime.getNano()).ifPresent(System.out::println);
    }

    public static void testCombineLocalDateWithLocalTime() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Optional.ofNullable(dateTime).ifPresent(System.out::println);
    }

    public static void testInstant() throws InterruptedException {
        Instant start = Instant.now();
//        System.out.println(now); //2020-04-09T00:49:06.276Z

        Thread.sleep(1000);
        Instant end = Instant.now();
        Duration duration = Duration.between(start,end);
        System.out.println(duration.toMillis());
    }

    //日期格式化
    public static void testDateTimeFormate(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        String format = dateTime.format(formatter);
        System.out.println(format);

        String date = "2015年10月02日";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate parse = LocalDate.parse(date,formatter1);
        System.out.println(parse);
    }
}
