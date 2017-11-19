package design19_中介者模式.sample_1.concreteColleague;

import design19_中介者模式.sample_1.colleague.Colleague;
import design19_中介者模式.sample_1.mediator.Mediator;

//具体同事类B
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println(getClass().getSimpleName()+"将信息递交给中介者处理");
    }
}
