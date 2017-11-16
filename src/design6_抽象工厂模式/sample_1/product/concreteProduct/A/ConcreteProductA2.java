package design6_抽象工厂模式.sample_1.product.concreteProduct.A;

import design6_抽象工厂模式.sample_1.product.abstractProduct.AbstractProductA;

//具体产品类A2
public class ConcreteProductA2 extends AbstractProductA{
    @Override
    public void method() {
        System.out.println("具体产品："+getClass().getSimpleName());
    }
}
