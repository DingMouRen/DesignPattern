package design15_代理模式.sample_2.proxy;

import design15_代理模式.sample_2.subject.ILawsuit;
//静态代理类
public class Lawer implements ILawsuit {
    private ILawsuit person;//持有一个具体被代理者的引用

    public Lawer(ILawsuit person) {
        this.person = person;
    }

    @Override
    public void submit() {
        person.submit();
    }

    @Override
    public void burden() {
        person.burden();
    }

    @Override
    public void defend() {
        person.defend();
    }

    @Override
    public void finish() {
        person.finish();
    }
}
