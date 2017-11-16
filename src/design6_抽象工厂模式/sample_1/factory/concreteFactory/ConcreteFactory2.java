package design6_抽象工厂模式.sample_1.factory.concreteFactory;

import design6_抽象工厂模式.sample_1.factory.abstractFactory.AbstractFactory;
import design6_抽象工厂模式.sample_1.product.abstractProduct.AbstractProductA;
import design6_抽象工厂模式.sample_1.product.abstractProduct.AbstractProductB;
import design6_抽象工厂模式.sample_1.product.concreteProduct.A.ConcreteProductA2;
import design6_抽象工厂模式.sample_1.product.concreteProduct.B.ConcreteProductB2;

//具体工厂类2
public class ConcreteFactory2 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
