package design4_装饰者模式.sample_1;

import design4_装饰者模式.sample_1.component.Component;
import design4_装饰者模式.sample_1.component.ConcreteComponent;
import design4_装饰者模式.sample_1.decorator.ConcreteDecoratorA;
import design4_装饰者模式.sample_1.decorator.ConcreteDecoratorB;
import design4_装饰者模式.sample_1.decorator.Decorator;

public class Test {
    public static void main(String[] args) {
        //构造被装饰的组件对象
        Component component = new ConcreteComponent();
        //根据组件对象构造装饰者对象A并调用，此时相当于给组件对象增加装饰者A的功能方法
        Decorator decorator = new ConcreteDecoratorA(component);
        decorator.operate();
        //根据组件对象构造装饰者对象B并调用，此时相当于给组件对象增加装饰者B的功能方法
        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operate();
    }
}
