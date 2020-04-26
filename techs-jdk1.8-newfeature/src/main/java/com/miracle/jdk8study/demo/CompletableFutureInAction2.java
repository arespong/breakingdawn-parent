package com.miracle.jdk8study.demo;

import java.util.Optional;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-08 21:42
 */
public class CompletableFutureInAction2 {
    private final static Random RANDOM = new Random(System.currentTimeMillis());

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2, r -> {
            Thread t = new Thread(r);
            t.setDaemon(false);
            return t;
        });

        CompletableFuture.supplyAsync(CompletableFutureInAction2::get,executorService).whenComplete((v,t)->{
            Optional.of(v).ifPresent(System.out::println);
            Optional.of(t).ifPresent(System.out::println);
        });
        System.out.println("非阻塞....");
        Thread.currentThread().join();
    }
    public static double get() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return RANDOM.nextDouble();
    }
}
