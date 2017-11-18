package design5_工厂方法模式.sample_2.product;
//具体产品类：一般的自行车
public class GeneralBike extends Bike {
    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName()+"可以骑了");
    }
}
