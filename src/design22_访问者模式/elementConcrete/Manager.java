package design22_访问者模式.elementConcrete;

import design22_访问者模式.element.Staff;
import design22_访问者模式.visitor.Visitor;

import java.util.Random;

//具体元素：经理级别
public class Manager extends Staff {
    private int products;//产品数量
    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //获取一年做的产品数量
    public int getProducts(){
        return products;
    }
}
