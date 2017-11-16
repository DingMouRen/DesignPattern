package design4_装饰者模式.sample_1.decorator;

import design4_装饰者模式.sample_1.component.Component;

public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        //装饰方法A和B既可在父类方法前调用也可在之后调用
        operateA();
        super.operate();
        operateB();

    }

    private void operateB() {
    }


    //自定义的装饰方法A
    private void operateA() {
    }


}
