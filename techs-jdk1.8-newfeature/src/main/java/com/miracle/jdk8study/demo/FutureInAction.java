package com.miracle.jdk8study.demo;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author AresPong
 * @email arespong@163.com
 * @create 2020-04-08 16:17
 */
public class FutureInAction {
    public static void main(String[] args) throws InterruptedException {
/*        Future<String> future = invoke(() -> {
            try {
                Thread.sleep(10000);
                return "I am finshed";
            } catch (InterruptedException e) {
                return "ERROR";
            }
        });

        System.out.println(future.get());
        System.out.println(future.get());
        System.out.println(future.get());

        while (!future.isDone()) {
            Thread.sleep(10);
        }
        ;
        System.out.println(future.get());*/

        block(() -> {
            try {
                Thread.sleep(10000);
                return "I am finshed";
            } catch (InterruptedException e) {
                return "ERROR";
            }
        });
    }

    private static <T> T block(Callable<T> callable) {
        return callable.action();
    }

    private static <T> Future<T> invoke(Callable<T> callable) {
        AtomicReference<T> result = new AtomicReference<>();
        AtomicBoolean finshed = new AtomicBoolean(false);

        Thread t = new Thread(() -> {
            T value = callable.action();
            result.set(value);
            finshed.set(true);
        });
        t.start();


        Future<T> future = new Future<T>() {
            @Override
            public T get() {
                return result.get();
            }

            @Override
            public boolean isDone() {
                return finshed.get();
            }
        };
        return future;
    }

    private interface Future<T> {
        T get();

        boolean isDone();
    }

    private interface Callable<T> {
        T action();
    }
}
