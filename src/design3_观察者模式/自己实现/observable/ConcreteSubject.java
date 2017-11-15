package design3_观察者模式.自己实现.observable;

import design3_观察者模式.自己实现.observer.Observer;

import java.lang.reflect.Array;
import java.util.ArrayList;

//具体目标：1.存储最新的状态数据 2.维护着所有观察者的集合 3.一旦数据更新，向所有观察者发送通知
public class ConcreteSubject implements Subject {
    private ArrayList<Observer> observers;//存储注册的观察者对象，ArrayList是线程不安全的，Vector是线程安全的
    private float temperature;//温度
    private float humidity;//湿度
    private float pressure;//压力

    public ConcreteSubject() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer == null) throw  new NullPointerException();
        if (!observers.contains(observer)) observers.add(observer);//判断是否有这个观察者，不然会被通知两回
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) observers.remove(index);
    }

    @Override
    public void notifyObservers() {
       notifyObservers(null);
    }

    @Override
    public void notifyObservers(Object arg) {
        for(Observer observer : observers){
            observer.update(this,arg);
        }
    }

    public void setNewData(float temperature,float humidity,float pressure){
        this.temperature =temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged(){
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
