package design5_工厂方法模式.sample_2.factory;

import design5_工厂方法模式.sample_2.product.Bike;

//抽象工厂类
public abstract class Factory {
    public abstract <T extends Bike> T createBike(Class<T> clz);
}
