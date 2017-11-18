package design16_桥接模式.sample_2.abstraction;

import design16_桥接模式.sample_2.implementor.CoffeeAdditives;

//抽象部分
public abstract class Coffee {
    protected CoffeeAdditives coffeeAdditives;//持有CoffeeAdditives的引用，方便调用它的具体实现

    public Coffee(CoffeeAdditives coffeeAdditives) {
        this.coffeeAdditives = coffeeAdditives;
    }

    //具体的咖啡由子类去具体实现，这里就定义一个抽象方法
    public abstract void makeCoffee();
}
