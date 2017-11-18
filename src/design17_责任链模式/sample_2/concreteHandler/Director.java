package design17_责任链模式.sample_2.concreteHandler;

import design17_责任链模式.sample_2.abstractHandler.Leader;

//具体处理者：主管
public class Director extends Leader{
    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println(getClass().getSimpleName()+"批复了"+money);
    }
}
