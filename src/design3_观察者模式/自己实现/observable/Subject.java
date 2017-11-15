package design3_观察者模式.自己实现.observable;

import design3_观察者模式.自己实现.observer.Observer;

//目标接口：1.定义注册接口  2.定义注销接口 3.定义发送通知的接口
public interface Subject {
    void registerObserver(Observer observer);//注册观察者
    void removeObserver(Observer observer);//注销观察者
    void notifyObservers();//目标状态变化时，调用这个方法通知所有观察者
    void notifyObservers(Object arg);//也可以通知所有的观察者，另外可以携带其他的数据
}
