package com.miracle.jdk8study.thread_pattern.chapter1;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-11 10:43
 */


public class SingleObeject3 {
    private static SingleObeject3 instance;

    private SingleObeject3() {

    }

    public synchronized SingleObeject3 getInstance() { //存在问题每次都要获取释放锁，效率比较低下
        if (instance == null)
            instance = new SingleObeject3();
        return this.instance;
    }
}
