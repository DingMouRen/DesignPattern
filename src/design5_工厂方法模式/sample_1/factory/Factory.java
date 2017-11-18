package design5_工厂方法模式.sample_1.factory;

import design5_工厂方法模式.sample_1.product.Product;
//抽象工厂类
public abstract class Factory {
    //抽象工厂方法，具体生产什么由子类来实现
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
