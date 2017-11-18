package design5_工厂方法模式.sample_1;

import design4_装饰者模式.sample_2.component.Person;
import design5_工厂方法模式.sample_1.factory.ConcreteFactory;
import design5_工厂方法模式.sample_1.factory.Factory;
import design5_工厂方法模式.sample_1.product.ConcreteProductA;
import design5_工厂方法模式.sample_1.product.Product;

public class Test {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProductA.class);
        product.method();
    }
}
