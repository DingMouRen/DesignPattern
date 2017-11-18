package design6_抽象工厂模式.sample_2;

import design6_抽象工厂模式.sample_2.factory.abstractFactory.BikeFactory;
import design6_抽象工厂模式.sample_2.factory.concreteFactory.GeneralBikeFactory;
import design6_抽象工厂模式.sample_2.factory.concreteFactory.MountainBikeFactory;

public class Test {
    public static void main(String[] args) {
        //创建工厂
        BikeFactory generalBikeFactory = new GeneralBikeFactory();
        BikeFactory mountainBikeFactory = new MountainBikeFactory();
        //生产一般自行车的部件用来组装
        System.out.println(generalBikeFactory.createHandleBar().showInfo());
        System.out.println(generalBikeFactory.createTyre().showInfo());
        System.out.println("一般自行车组装完成");
        System.out.println("--------");
        System.out.println(mountainBikeFactory.createHandleBar().showInfo());
        System.out.println(mountainBikeFactory.createTyre().showInfo());
        System.out.println("山地自行车组装完成");
    }
}
