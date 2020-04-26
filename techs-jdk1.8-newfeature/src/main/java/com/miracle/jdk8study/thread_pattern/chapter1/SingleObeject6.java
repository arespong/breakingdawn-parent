package com.miracle.jdk8study.thread_pattern.chapter1;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-11 10:43
 */

public class SingleObeject6 {
    private SingleObeject6() {
    }

    private static class InstanceHolder {
        private final static SingleObeject6 instance = new SingleObeject6();
    }

    public static SingleObeject6 getInstance() {
        return InstanceHolder.instance;
    }
}
