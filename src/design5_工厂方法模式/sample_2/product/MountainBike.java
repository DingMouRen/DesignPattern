package design5_工厂方法模式.sample_2.product;
//具体产品类：山地自行车
public class MountainBike extends Bike {
    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName()+"可以骑了");
    }
}
