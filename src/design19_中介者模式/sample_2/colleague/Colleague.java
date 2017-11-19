package design19_中介者模式.sample_2.colleague;

import design19_中介者模式.sample_2.mediator.Mediator;

//抽象同事
public abstract class Colleague {
    protected Mediator mediator;//每一个同事类都有中介者的引用

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
