package design6_抽象工厂模式.sample_2.product.concreteProduct.tyre;

import design6_抽象工厂模式.sample_2.product.abstractProduct.Tyre;

//具体产品类：山地车的轮胎
public class MountainBikeTyre implements Tyre {
    @Override
    public String showInfo() {
        return "轮胎类型："+getClass().getSimpleName();
    }
}
