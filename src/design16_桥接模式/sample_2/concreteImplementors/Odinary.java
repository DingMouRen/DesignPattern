package design16_桥接模式.sample_2.concreteImplementors;

import design16_桥接模式.sample_2.implementor.CoffeeAdditives;

//不加糖的，也就是原味的啦
public class Odinary  extends CoffeeAdditives{
    @Override
    public String addSomething() {
        return "原味的";
    }
}
