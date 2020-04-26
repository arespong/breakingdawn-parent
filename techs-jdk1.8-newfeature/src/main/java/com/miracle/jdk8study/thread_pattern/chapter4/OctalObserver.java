package com.miracle.jdk8study.thread_pattern.chapter4;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Octable String:"+Integer.toOctalString(subject.getState()));
    }
}
