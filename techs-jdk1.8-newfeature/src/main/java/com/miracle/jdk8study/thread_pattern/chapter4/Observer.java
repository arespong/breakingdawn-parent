package com.miracle.jdk8study.thread_pattern.chapter4;

public abstract class Observer {
    protected Subject subject;
    public Observer(Subject subject){
        this.subject=subject;
        this.subject.attach(this);
    }
    public abstract void update();
}
