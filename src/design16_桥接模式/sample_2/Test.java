package design16_桥接模式.sample_2;

import design16_桥接模式.sample_2.abstractionRefined.LargeCoffee;
import design16_桥接模式.sample_2.abstractionRefined.SmallCoffee;
import design16_桥接模式.sample_2.concreteImplementors.Odinary;
import design16_桥接模式.sample_2.concreteImplementors.Sugar;

public class Test {
    public static void main(String[] args) {
        //准备糖 和 原味的
        Sugar sugar = new Sugar();
        Odinary odinary = new Odinary();
        //下面分别做四种咖啡：大杯原味 小杯原味  大杯加糖  小杯加糖
        LargeCoffee largeCoffeeOdinary = new LargeCoffee(odinary);
        largeCoffeeOdinary.makeCoffee();

        SmallCoffee smallCoffeeOdinary = new SmallCoffee(odinary);
        smallCoffeeOdinary.makeCoffee();

        LargeCoffee largeCoffeeSugar = new LargeCoffee(sugar);
        largeCoffeeSugar.makeCoffee();

        SmallCoffee smallCoffeeSugar = new SmallCoffee(sugar);
        smallCoffeeSugar.makeCoffee();
    }
}
