package com.miracle.jdk8study.thread_pattern.chapter11;

public class QueryFromHttpAction {
/*    public void execute(Context context) {
        String name = context.getName();
        String cardId = getCardId(name);
        context.setCardId(cardId);
    }*/

    public void execute() {
        Context context = ActionContext.getActionContext().getContext();
        String name = context.getName();
        String cardId = getCardId(name);
        context.setCardId(cardId);
    }

    private String getCardId(String name) {
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "89757";
    }

}
