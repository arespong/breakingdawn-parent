package com.miracle.jdk8study.demo;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author AresPong
 * @email arespong@163.com
 * @create 2020-04-08 16:17
 */
public class FutureInAction3 {
    public static void main(String[] args) throws InterruptedException {
        Future<String> future = invoke(() -> {
            try {
                Thread.sleep(10000);
                return "I am finshed";
            } catch (InterruptedException e) {
                return "ERROR";
            }
        });

//        Thread.currentThread().sleep(20000);

        future.setCompletable(new Completable<String>() {
            @Override
            public void complete(String s) {
                System.out.println(s);
            }

            @Override
            public void exeception(Throwable cause) {
                System.out.println(cause);
                cause.printStackTrace();
            }
        });


    }

    private static <T> Future<T> invoke(Callable<T> callable) {
        AtomicReference<T> result = new AtomicReference<>();
        AtomicBoolean finshed = new AtomicBoolean(false);
        Future<T> future = new Future<T>() {
            private Completable<T> completable;

            @Override
            public T get() {
                return result.get();
            }

            @Override
            public boolean isDone() {
                return finshed.get();
            }

            @Override
            public void setCompletable(Completable<T> completable) {
                this.completable = completable;
            }

            @Override
            public Completable<T> getCompletable() {
                return completable;
            }
        };
        Thread t = new Thread(() -> {
            try {
                T value = callable.action();
                result.set(value);
                finshed.set(true);
                if (future.getCompletable() != null)
                    future.getCompletable().complete(value);
            } catch (Throwable cause) {
                if (future.getCompletable() != null)
                    future.getCompletable().exeception(cause);
            }
        });
        t.start();

        return future;
    }

    private interface Future<T> {
        T get();

        boolean isDone();

        void setCompletable(Completable<T> completable);

        Completable<T> getCompletable();
    }

    private interface Callable<T> {
        T action();
    }

    private interface Completable<T> {
        void complete(T t);

        void exeception(Throwable cause);
    }
}
