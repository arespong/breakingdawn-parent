package com.miracle.jdk8study.thread_pattern.chapter4;

public class ObserverClient {
    public static void main(String[] args) {
        final Subject subject = new Subject();
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("*************");
        subject.setState(10);
        System.out.println("*************");
        subject.setState(10);
        System.out.println("*************");
        subject.setState(20);

    }

}
