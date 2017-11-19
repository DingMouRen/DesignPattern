package design19_中介者模式.sample_1.concreteMediator;

import design19_中介者模式.sample_1.mediator.Mediator;

//具体中介者
public class ConcreteMediator extends Mediator {
    @Override
    public void method() {
        concreteColleagueA.action();
        concreteColleagueB.action();
    }
}
