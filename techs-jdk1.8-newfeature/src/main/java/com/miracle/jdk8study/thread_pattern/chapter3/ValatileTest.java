package com.miracle.jdk8study.thread_pattern.chapter3;

public class ValatileTest {
//    private volatile static int INIT_VALUE = 0;
    private  static int INIT_VALUE = 0;
    private final static int MAX_LIMIT = 100;

    public static void main(String[] args) {
        new Thread(() -> {
            int localValue = INIT_VALUE;
            while (localValue < MAX_LIMIT) {
                if (localValue != INIT_VALUE) {
                    System.out.println(Thread.currentThread().getName()+": The value updated to[+" + INIT_VALUE + "]");
                    localValue = INIT_VALUE;
                }
            }
        },"READER").start();

        new Thread(()->{
            int localValue =INIT_VALUE;
            while (INIT_VALUE<MAX_LIMIT){
                System.out.println(Thread.currentThread().getName()+": Update the localValue to "+(++localValue));
                INIT_VALUE =localValue;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"UPDATER").start();

    }

}
