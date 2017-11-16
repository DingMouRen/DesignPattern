package design6_抽象工厂模式.sample_2.factory.concreteFactory;

import design6_抽象工厂模式.sample_2.factory.abstractFactory.BikeFactory;
import design6_抽象工厂模式.sample_2.product.abstractProduct.HandleBar;
import design6_抽象工厂模式.sample_2.product.abstractProduct.Tyre;
import design6_抽象工厂模式.sample_2.product.concreteProduct.handleBar.GeneralBikeHandleBar;
import design6_抽象工厂模式.sample_2.product.concreteProduct.tyre.GeneralBikeTyre;

//具体工厂类：一般的自行车
public class GeneralBikeFactory extends BikeFactory{
    @Override
    public Tyre createTyre() {
        return new GeneralBikeTyre();
    }

    @Override
    public HandleBar createHandleBar() {
        return new GeneralBikeHandleBar();
    }
}
