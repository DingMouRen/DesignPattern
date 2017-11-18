package design13_组合模式.sample_1.component;
//抽象根节点:这是安全的组合模式，叶子节点与枝干节点的结构不同
public abstract class Component {
    protected String name ;//节点名

    public Component(String name) {
        this.name = name;
    }
    public abstract void showName();
}
