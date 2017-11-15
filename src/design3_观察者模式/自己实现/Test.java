package design3_观察者模式.自己实现;

import design3_观察者模式.自己实现.observable.ConcreteSubject;
import design3_观察者模式.自己实现.observer.ConcreteObserver_1;
import design3_观察者模式.自己实现.observer.ConcreteObserver_2;

public class Test {
    public static void main(String[] args) {
        //创建目标，可观察者
        ConcreteSubject concreteSubject = new ConcreteSubject();
        //创建观察者并注册
        ConcreteObserver_1 observer_1 = new ConcreteObserver_1(concreteSubject);
        ConcreteObserver_2 observer_2 = new ConcreteObserver_2(concreteSubject);
        //更新数据
        concreteSubject.setNewData(1,2,3);
    }
}
