package design3_观察者模式.自己实现.observer;

import design3_观察者模式.自己实现.observable.ConcreteSubject;
import design3_观察者模式.自己实现.observable.Subject;
//具体观察者：1.维护着一个目标的引用  2.实现观察者接口，更新状态与目标状态一致
public class ConcreteObserver_1 implements Observer,DisplayNewData {
    private Subject subject;
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//压力

    public ConcreteObserver_1(Subject subject) {//传入目标subject用来注册观察者，自然也可以删除观察者
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    /**
     * 这里获取的更新数据的方式是“拉”，我们想要什么数据，就通过get方法获得，而不是目标把数据主动推给观察者的
     * @param subject
     * @param arg
     */
    @Override
    public void update(Subject subject, Object arg) {
        ConcreteSubject concreteSubject = (ConcreteSubject) subject;
        this.temperature = concreteSubject.getTemperature();
        this.humidity = concreteSubject.getHumidity();
        this.pressure = concreteSubject.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName()+"最新的数据：\n温度："+temperature+"℃ 湿度："+humidity+"% 压力："+pressure);
    }
}
