package design6_抽象工厂模式.sample_1.factory.abstractFactory;

import design6_抽象工厂模式.sample_1.product.abstractProduct.AbstractProductA;
import design6_抽象工厂模式.sample_1.product.abstractProduct.AbstractProductB;

//抽象工厂类
public abstract class AbstractFactory {
    //创建产品A的方法
    public abstract AbstractProductA createProductA();
    //创建产品B的方法
    public abstract AbstractProductB createProductB();
}
