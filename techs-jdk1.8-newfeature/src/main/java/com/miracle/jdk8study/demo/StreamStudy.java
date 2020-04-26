package com.miracle.jdk8study.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author AresPong
 * @email arespong@163.com
 * @create 2020-04-08 10:36
 */
public class StreamStudy {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "1", "2", "2", "3", "3", "4");
        list.stream().distinct().forEach(System.out::println);
        List<String> list1 = list.stream().distinct().collect(Collectors.toList());
        List<Integer> list2 = list1.stream().map(el -> Integer.parseInt(el)).collect(Collectors.toList());
        Optional<Integer> first = list2.stream().findFirst();
        first.ifPresent(System.out::println);
        System.out.println("*************");
        List<String> nums = Arrays.asList("1", "1", "2", "2", "3", "3", "4");
        Optional<String> optional = nums.stream().findAny();

        Integer[] arr = {1,2,3,4,5};
        //T reduce(T identity, BinaryOperator<T> accumulator);
        Integer integer = Arrays.stream(arr).reduce(0, (x, y) -> x + y);
        System.out.println(integer);
    }
}
