package design19_中介者模式.sample_2.mediator;

import design19_中介者模式.sample_2.colleague.Colleague;

//抽象中介者
public abstract class Mediator {
    //同事对象改变时通知中介者的方法，在同事对象改变时由中介者去通知其他的同事对象
    public abstract void changed(Colleague colleague);
}
