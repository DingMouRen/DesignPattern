package design16_桥接模式.sample_2.abstractionRefined;

import design16_桥接模式.sample_2.abstraction.Coffee;
import design16_桥接模式.sample_2.implementor.CoffeeAdditives;

//大杯咖啡
public class LargeCoffee extends Coffee{
    public LargeCoffee(CoffeeAdditives coffeeAdditives) {
        super(coffeeAdditives);
    }

    @Override
    public void makeCoffee() {
        System.out.println(getClass().getSimpleName()+":大杯的"+coffeeAdditives.addSomething()+"咖啡");
    }
}
