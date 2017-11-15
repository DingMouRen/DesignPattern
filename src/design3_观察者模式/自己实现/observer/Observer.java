package design3_观察者模式.自己实现.observer;

import design3_观察者模式.自己实现.observable.Subject;

//观察者接口
public interface Observer {
    void update(Subject subject,Object arg);
}
