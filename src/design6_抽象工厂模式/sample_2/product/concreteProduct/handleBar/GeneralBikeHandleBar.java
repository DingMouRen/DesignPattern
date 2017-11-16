package design6_抽象工厂模式.sample_2.product.concreteProduct.handleBar;

import design6_抽象工厂模式.sample_2.product.abstractProduct.HandleBar;

//具体产品类：一般自行车的车把
public class GeneralBikeHandleBar implements HandleBar {
    @Override
    public String showInfo() {
        return "车把类型："+getClass().getSimpleName();
    }
}
