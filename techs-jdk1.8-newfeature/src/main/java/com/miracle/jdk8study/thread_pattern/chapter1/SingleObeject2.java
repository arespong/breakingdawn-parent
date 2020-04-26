package com.miracle.jdk8study.thread_pattern.chapter1;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-11 10:43
 */


public class SingleObeject2 {
    private static SingleObeject2 instance;

    private SingleObeject2() {

    }

    public SingleObeject2 getInstance() { //此时存在线程安全问题
        if (instance == null)
            instance = new SingleObeject2();
        return this.instance;
    }
}
