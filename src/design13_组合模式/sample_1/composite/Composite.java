package design13_组合模式.sample_1.composite;

import design13_组合模式.sample_1.component.Component;

import java.util.ArrayList;
import java.util.List;

//具体枝干节点
public class Composite extends Component{
    //存储节点的容器
    private List<Component> components = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void showName() {
        System.out.println(this.getClass().getSimpleName()+"的name:"+name);
        if (null != components){
            for (Component component : components) component.showName();
        }
    }

    //添加子节点
    public void addChild(Component child){
        components.add(child);
    }

    //移除子节点
    public void removeChild(Component child){
        components.remove(child);
    }

    //获取子节点
    public Component getChild(int index){
        return components.get(index);
    }
}
