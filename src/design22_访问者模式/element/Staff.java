package design22_访问者模式.element;

import design22_访问者模式.visitor.Visitor;

import java.util.Random;

//抽象元素类：员工基类
public abstract class Staff {
    public String name;
    public int kpi;//员工kpi

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }
    //接收visitor的访问
    public abstract void accept(Visitor visitor);
}
