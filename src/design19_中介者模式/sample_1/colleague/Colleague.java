package design19_中介者模式.sample_1.colleague;

import design19_中介者模式.sample_1.mediator.Mediator;

import javax.print.attribute.standard.Media;

//抽象同事类
public abstract class Colleague {
    protected Mediator mediator;//中介者对象的引用

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    //同事类的抽象方法，由子类具体实现
    public abstract void action();
}
