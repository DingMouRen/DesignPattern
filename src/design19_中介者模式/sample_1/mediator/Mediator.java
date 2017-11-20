package design19_中介者模式.sample_1.mediator;

import design19_中介者模式.sample_1.concreteColleague.ConcreteColleagueA;
import design19_中介者模式.sample_1.concreteColleague.ConcreteColleagueB;

//抽象中介者
public abstract class Mediator {
    protected ConcreteColleagueA concreteColleagueA;//具体同事类A
    protected ConcreteColleagueB concreteColleagueB;//具体同事类B

    //抽象中介方法，由具体子类实现
    public abstract void method();

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }
}
