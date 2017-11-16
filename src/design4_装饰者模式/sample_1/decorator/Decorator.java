package design4_装饰者模式.sample_1.decorator;

import design4_装饰者模式.sample_1.component.Component;

public abstract class Decorator extends Component {
    private Component component;//持有一个Component对象的引用

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
