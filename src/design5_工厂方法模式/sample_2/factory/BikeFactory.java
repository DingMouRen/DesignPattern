package design5_工厂方法模式.sample_2.factory;

import design5_工厂方法模式.sample_2.product.Bike;

//具体工厂类
public class BikeFactory extends Factory{
    @Override
    public <T extends Bike> T createBike(Class<T> clz) {
        Bike bike = null;
        try {
            bike = (Bike) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) bike;
    }
}
