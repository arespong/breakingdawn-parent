package com.miracle.jdk8study.demo;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-08 22:13
 */
public class CompletableFutureAction3 {
    private final static Random RANDOM = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2, r -> {
            Thread t = new Thread(r);
            t.setDaemon(false);
            return t;
        });
        CompletableFuture.supplyAsync(CompletableFutureAction3::get, executorService).thenApply(CompletableFutureAction3::mutiply).whenComplete((v,t)->{
            Optional.of(v).ifPresent(System.out::println);
        });
    }

    public static double get() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return RANDOM.nextDouble();
    }

    public static double mutiply(Double value) {
        try {
            Thread.currentThread().sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value * 10;
    }
}
