package design6_抽象工厂模式.sample_2.factory.concreteFactory;

import design6_抽象工厂模式.sample_2.factory.abstractFactory.BikeFactory;
import design6_抽象工厂模式.sample_2.product.abstractProduct.HandleBar;
import design6_抽象工厂模式.sample_2.product.abstractProduct.Tyre;
import design6_抽象工厂模式.sample_2.product.concreteProduct.handleBar.MountainBikeHandleBar;
import design6_抽象工厂模式.sample_2.product.concreteProduct.tyre.MountainBikeTyre;

//具体工厂类：山地车
public class MountainBikeFactory extends BikeFactory {
    @Override
    public Tyre createTyre() {
        return new MountainBikeTyre();
    }

    @Override
    public HandleBar createHandleBar() {
        return new MountainBikeHandleBar();
    }
}
