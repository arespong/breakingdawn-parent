package com.miracle.jdk8study.thread_pattern.chapter8;

public interface Future<T> {
    T get() throws InterruptedException;
}
