package design16_桥接模式.sample_2.concreteImplementors;

import design16_桥接模式.sample_2.implementor.CoffeeAdditives;

//加糖
public class Sugar extends CoffeeAdditives {
    @Override
    public String addSomething() {
        return "加糖的";
    }
}
