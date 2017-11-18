package design5_工厂方法模式.sample_1.product;
//具体产品类A
public class ConcreteProductA extends Product {
    @Override
    public void method() {
        System.out.println("具体产品："+getClass().getSimpleName());
    }
}
