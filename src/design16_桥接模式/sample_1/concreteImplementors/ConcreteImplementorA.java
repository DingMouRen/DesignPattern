package design16_桥接模式.sample_1.concreteImplementors;

import design16_桥接模式.sample_1.implementor.Implementor;

//实现部分的具体实现A
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println(getClass().getSimpleName()+"执行相应的逻辑");
    }
}
