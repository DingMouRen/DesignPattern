package design4_装饰者模式.sample_1.decorator;

import design4_装饰者模式.sample_1.component.Component;

public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        operateA();
        super.operate();
        operateB();
    }

    private void operateA() {
    }
    //自定义的装饰方法B

    private void operateB() {
    }
}
