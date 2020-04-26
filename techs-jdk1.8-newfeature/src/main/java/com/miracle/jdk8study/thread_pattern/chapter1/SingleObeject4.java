package com.miracle.jdk8study.thread_pattern.chapter1;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-11 10:43
 */

/**
 * 存在的问题：空指针异常
 *      原因:如果SingleObeject4中存在其它引用，在getInstance创建的单例
 *      还没有真正创建成功。而用改实例去调用其它引用。
 */
public class SingleObeject4 {
    private static SingleObeject4 instance;

    private SingleObeject4() {

    }

    public SingleObeject4 getInstance() {
        if (instance == null) {
            synchronized (SingleObeject4.class) {
                if (instance == null) {
                    instance = new SingleObeject4();
                }
            }
        }

        return this.instance;
    }
}
