package com.miracle.jdk8study.thread_pattern.chapter1;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-11 10:43
 */

/**

 *
 * volatile:
 *      1.并不能保证原子性；
 *      2.保证内存的可能性(多个内存看到的内容是同一份)
 *      3.保证有序性。
 */
public class SingleObeject5 {
    private  volatile static SingleObeject5 instance;

    private SingleObeject5() {
    }

    public SingleObeject5 getInstance() {
        if (instance == null) {
            synchronized (SingleObeject5.class) {
                if (instance == null) {
                    instance = new SingleObeject5();
                }
            }
        }

        return this.instance;
    }
}
