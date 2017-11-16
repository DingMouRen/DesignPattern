package design6_抽象工厂模式.sample_2.product.concreteProduct.handleBar;

import design6_抽象工厂模式.sample_2.product.abstractProduct.HandleBar;

//具体产品类：山地车的车把
public class MountainBikeHandleBar implements HandleBar{
    @Override
    public String showInfo() {
        return "车把类型："+getClass().getSimpleName();
    }
}
