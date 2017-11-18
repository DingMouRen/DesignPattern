package design16_桥接模式.sample_2.implementor;
//实现部分，加糖不加糖的抽象
public abstract class CoffeeAdditives {
    //加入咖啡的具体作料由子类来指定
    public abstract String addSomething();
}
