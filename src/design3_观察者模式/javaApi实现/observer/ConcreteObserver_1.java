package design3_观察者模式.javaApi实现.observer;


import design3_观察者模式.javaApi实现.observable.ConcreteObservable;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver_1 implements Observer,DisplayNewData {

    private Observable observable;
    private float temperature;
    private float humidity;

    public ConcreteObserver_1(Observable observable) {//构造器需要一个Observble作为参数，将当前对象添加为观察者对象
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ConcreteObservable){
            ConcreteObservable observable = (ConcreteObservable) o;
            this.temperature = observable.getTemperature();
            this.humidity = observable.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("java实现当前状况："+temperature+"度  "+humidity+"% 湿度");

    }

}
