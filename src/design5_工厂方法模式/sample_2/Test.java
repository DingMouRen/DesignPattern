package design5_工厂方法模式.sample_2;

import design5_工厂方法模式.sample_2.factory.BikeFactory;
import design5_工厂方法模式.sample_2.factory.Factory;
import design5_工厂方法模式.sample_2.product.Bike;
import design5_工厂方法模式.sample_2.product.GeneralBike;
import design5_工厂方法模式.sample_2.product.MountainBike;

public class Test {
    public static void main(String[] args) {
        //创建工厂对象
        Factory factory = new BikeFactory();
        //创建自行车
        Bike generalBike = factory.createBike(GeneralBike.class);
        Bike mountainBike = factory.createBike(MountainBike.class);
        //自行车试驾
        generalBike.drive();
        mountainBike.drive();

    }
}
