package design17_责任链模式.sample_2.concreteHandler;

import design17_责任链模式.sample_2.abstractHandler.Leader;

//具体处理者：老板
public class Boss extends Leader {
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        System.out.println(getClass().getSimpleName()+"批复了"+money);
    }
}
