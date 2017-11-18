package design16_桥接模式.sample_2.abstractionRefined;

import design16_桥接模式.sample_2.abstraction.Coffee;
import design16_桥接模式.sample_2.implementor.CoffeeAdditives;

//小杯咖啡
public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println(getClass().getSimpleName()+":小杯的"+coffeeAdditives.addSomething()+"咖啡");
    }
}
