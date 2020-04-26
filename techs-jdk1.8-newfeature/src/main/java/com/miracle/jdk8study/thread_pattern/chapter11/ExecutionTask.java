package com.miracle.jdk8study.thread_pattern.chapter11;

public class ExecutionTask implements Runnable {
    private QueryFromDBAction dbAction = new QueryFromDBAction();
    private QueryFromHttpAction httpAction = new QueryFromHttpAction();
    @Override
    public void run() {
        Context context = ActionContext.getActionContext().getContext();
        dbAction.execute();
        System.out.println("The name queried successfully....");
        httpAction.execute();
        System.out.println("The cardId queried successfully....");
        System.out.println("The name is "+context.getName()+" and the cardId is "+context.getCardId());

    }
}
