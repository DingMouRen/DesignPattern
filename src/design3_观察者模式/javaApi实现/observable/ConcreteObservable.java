package design3_观察者模式.javaApi实现.observable;

import java.util.Observable;

//使用java中的观察者模式，线程是安全的哦
public class ConcreteObservable extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged(){
        setChanged();
        notifyObservers();//没有使用传递数据对象的方法，表示要使用的做法是“啦”
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();//更新数据
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
