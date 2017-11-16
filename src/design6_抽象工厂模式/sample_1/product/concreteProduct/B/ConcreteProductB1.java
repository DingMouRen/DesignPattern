package design6_抽象工厂模式.sample_1.product.concreteProduct.B;

import design6_抽象工厂模式.sample_1.product.abstractProduct.AbstractProductB;

//具体产品类B1
public class ConcreteProductB1 extends AbstractProductB {
    @Override
    public void method() {
        System.out.println("具体产品："+getClass().getSimpleName());
    }
}
