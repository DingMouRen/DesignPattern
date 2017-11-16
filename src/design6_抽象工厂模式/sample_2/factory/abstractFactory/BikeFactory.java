package design6_抽象工厂模式.sample_2.factory.abstractFactory;

import design6_抽象工厂模式.sample_2.product.abstractProduct.HandleBar;
import design6_抽象工厂模式.sample_2.product.abstractProduct.Tyre;

//抽象工厂类
public abstract class BikeFactory {
    //生产轮胎
    public abstract Tyre createTyre();
    //生产车把
    public abstract HandleBar createHandleBar();
}
