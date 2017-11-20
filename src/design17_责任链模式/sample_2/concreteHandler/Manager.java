package design17_责任链模式.sample_2.concreteHandler;

import design17_责任链模式.sample_2.abstractHandler.Leader;

//具体处理者：经理
public class Manager extends Leader{
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println(getClass().getSimpleName()+"批复了"+money);
    }
}
