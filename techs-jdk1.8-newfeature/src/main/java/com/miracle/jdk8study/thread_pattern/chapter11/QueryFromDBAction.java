package com.miracle.jdk8study.thread_pattern.chapter11;

public class QueryFromDBAction {
    /*    public void execute(Context context){
            try {
                Thread.sleep(1000L);
                String name = "Alex "+Thread.currentThread().getName();
                context.setName(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };*/
    public void execute() {
        try {
            Thread.sleep(1000L);
            String name = "Alex " + Thread.currentThread().getName();
            ActionContext.getActionContext().getContext().setName(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    ;
}
