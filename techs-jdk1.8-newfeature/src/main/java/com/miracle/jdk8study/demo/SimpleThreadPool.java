package com.miracle.jdk8study.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * @author AresPong
 * @email arespong@163.com
 * @createTime 2020-04-10 15:32
 */
public class SimpleThreadPool {
    public final int size;

    private final static int DEFAULT_SIZE = 10;

    private static volatile int seq = 0;

    private final static String THREAD_PREFIX = "SIMPLE_THREAD_POOL-";

    private final static ThreadGroup GROUP = Thread.currentThread().getThreadGroup();

    private final static LinkedList<Runnable> TASK_QUEUE = new LinkedList<>();
    private final static ArrayList<WorkerTask> THREAD_QUEUE = new ArrayList<>();

    public SimpleThreadPool() {
        this(DEFAULT_SIZE);
    }

    public SimpleThreadPool(int size) {
        this.size = size;
        init();
    }

    private void init() {
        for (int i = 0; i < size; i++) {
            createWorkTask();
        }
    }

    public void submit(Runnable runnable) {
        synchronized (TASK_QUEUE) {
            TASK_QUEUE.addLast(runnable);
            TASK_QUEUE.notifyAll();
        }

    }


    private void createWorkTask() {
        WorkerTask task = new WorkerTask(GROUP, THREAD_PREFIX + (seq++));
        task.start();
        THREAD_QUEUE.add(task);

    }

    private enum TaskState {
        FREE, RUNNING, BLOCKED, DEAD
    }

    private static class WorkerTask extends Thread {
        private volatile TaskState taskState = TaskState.FREE;

        public TaskState getTaskState() {
            return this.taskState;
        }

        @Override
        public void run() {
            OUTER:
            while (this.taskState != TaskState.DEAD) {
                Runnable runnable;
                synchronized (TASK_QUEUE) {
                    while (TASK_QUEUE.isEmpty()) {
                        try {
                            taskState = TaskState.BLOCKED;
                            TASK_QUEUE.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            break OUTER;
                        }
                    }
                }
              runnable = TASK_QUEUE.removeFirst();
                if (runnable != null) {
                    this.taskState = TaskState.RUNNING;
                    runnable.run();
                    this.taskState = TaskState.FREE;
                }
            }

        }

        public WorkerTask(ThreadGroup threadGroup, String name) {
            super(threadGroup, name);
        }

        public void close() {
            this.taskState = TaskState.DEAD;
        }
    }

    public static void main(String[] args) {
        SimpleThreadPool threadPool = new SimpleThreadPool();
/*
        IntStream.rangeClosed(0, 40).forEach(i -> threadPool.submit(() -> {
                    System.out.println("The runnable " + i + " is serviced by " + Thread.currentThread().getName()+"....start");
                    try {
                        Thread.currentThread().sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("The runnable " + i + " is serviced by " + Thread.currentThread().getName()+"....finished");
                }
        ));
*/

        for (int i = 0; i < 40; i++) {
            threadPool.submit(()->{
                System.out.println("The runnable "  + " is serviced by " + Thread.currentThread().getName()+"....start");
                try {
                    Thread.currentThread().sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The runnable " + " is serviced by " + Thread.currentThread().getName()+"....finished");
            });
        }


    }

}
