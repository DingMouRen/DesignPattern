package design5_工厂方法模式.sample_1.factory;

import design5_工厂方法模式.sample_1.product.ConcreteProductA;
import design5_工厂方法模式.sample_1.product.Product;
//具体工厂类
public class ConcreteFactory extends Factory {

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
