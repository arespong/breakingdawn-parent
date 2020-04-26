package com.miracle.jdk8study.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-08 20:04
 */
public class FutureInAction2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            try {
                Thread.sleep(10000);
                return "I am finshed";
            } catch (InterruptedException e) {
                return "ERROR";
            }
        });

        while (!future.isDone());
        String s = future.get();
        System.out.println(s);
        executorService.shutdown();
    }
}
