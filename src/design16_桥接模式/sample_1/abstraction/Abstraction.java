package design16_桥接模式.sample_1.abstraction;

import design16_桥接模式.sample_1.implementor.Implementor;

//定义抽象部分的接口
public abstract class Abstraction {
    private Implementor implementor;//声明一个私有成员变量来引用实现部分的对象
    //通过实现部分对象的引用来构造抽象部分的对象
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    //通过调用实现部分对象的具体方法来实现具体的功能
    public void operation(){
        implementor.operationImpl();
    }
}
