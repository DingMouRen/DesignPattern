package design13_组合模式.sample_1.leaf;

import design13_组合模式.sample_1.component.Component;

//具体子节点
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void showName() {
        System.out.println(getClass().getSimpleName()+"的name:"+name);
    }
}
