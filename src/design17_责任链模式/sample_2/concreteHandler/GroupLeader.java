package design17_责任链模式.sample_2.concreteHandler;

import design17_责任链模式.sample_2.abstractHandler.Leader;
//具体处理者：组长
public class GroupLeader extends Leader {
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println(getClass().getSimpleName()+"批复了"+money);
    }
}
