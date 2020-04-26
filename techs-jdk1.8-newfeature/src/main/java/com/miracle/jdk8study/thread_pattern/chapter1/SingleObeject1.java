package com.miracle.jdk8study.thread_pattern.chapter1;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-11 10:43
 */

/**
 * 饿汉式
 *      此时存在问题是无法懒加载。
 */
public class SingleObeject1 {
    private final SingleObeject1 singleObeject1;

    private SingleObeject1(SingleObeject1 singleObeject1) {
        this.singleObeject1 = singleObeject1;
    }

    public SingleObeject1 getInstance() {
        return this.singleObeject1;
    }
}
