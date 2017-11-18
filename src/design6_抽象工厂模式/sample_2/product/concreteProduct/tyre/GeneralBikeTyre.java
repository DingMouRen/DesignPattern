package design6_抽象工厂模式.sample_2.product.concreteProduct.tyre;

import design6_抽象工厂模式.sample_2.product.abstractProduct.Tyre;

//具体产品类：一般自行车的车把
public class GeneralBikeTyre implements Tyre{
    @Override
    public String showInfo() {
        return "轮胎类型："+getClass().getSimpleName();
    }
}
