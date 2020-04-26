package com.miracle.jdk8study.thread_pattern.chapter11;

import java.util.stream.IntStream;

public class ContestTest {
    public static void main(String[] args) {
        IntStream.range(1,5).forEach(i->{
           new Thread(new ExecutionTask()).start();
        });
    }
}
