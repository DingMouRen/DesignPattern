package design6_抽象工厂模式.sample_1;

import design6_抽象工厂模式.sample_1.factory.abstractFactory.AbstractFactory;
import design6_抽象工厂模式.sample_1.factory.concreteFactory.ConcreteFactory1;
import design6_抽象工厂模式.sample_1.factory.concreteFactory.ConcreteFactory2;
import design6_抽象工厂模式.sample_1.product.abstractProduct.AbstractProductA;
import design6_抽象工厂模式.sample_1.product.abstractProduct.AbstractProductB;

public class Test {
    public static void main(String[] args) {
        //
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();
        productA1.method();
        productB1.method();

        System.out.println("----");
        //
        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();
        productA2.method();
        productB2.method();
    }
}
