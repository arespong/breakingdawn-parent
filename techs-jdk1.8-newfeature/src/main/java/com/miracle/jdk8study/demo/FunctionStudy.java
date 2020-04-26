package com.miracle.jdk8study.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Function<T, R>
//    R apply(T t);

/**
 * @author AresPong
 * @email arespong@163.com
 * @create 2020-04-08 09:11
 */
public class FunctionStudy {
    public static void main(String[] args) {
        Function<String, Integer> function = (x) -> Integer.parseInt(x);
        Integer num = 3 + function.apply("4");
        System.out.println(num);

        Function<String, Integer> function1 = FunctionStudy::change;
        Integer num1 =4+function1.apply("5");

        System.out.println(add(5,"6",x->Integer.parseInt(x)));

    }

    private static Integer change(String str){
        return Integer.parseInt(str);
    }

    private static Integer add (Integer a,String b,Function<String,Integer> function){
        return a+function.apply(b);
    }
}
