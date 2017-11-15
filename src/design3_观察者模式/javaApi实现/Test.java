package design3_观察者模式.javaApi实现;


import design3_观察者模式.javaApi实现.observable.ConcreteObservable;
import design3_观察者模式.javaApi实现.observer.ConcreteObserver_1;
import design3_观察者模式.javaApi实现.observer.ConcreteObserver_2;

public class Test {
    public static void main(String[] args) {
        ConcreteObservable observble = new ConcreteObservable();
        ConcreteObserver_1 observer1 = new ConcreteObserver_1(observble);
        ConcreteObserver_2 observer2 = new ConcreteObserver_2(observble);

        observble.setMeasurements(11,11,11);
    }
}
