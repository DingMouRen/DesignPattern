package design13_组合模式.sample_1;

import design13_组合模式.sample_1.composite.Composite;
import design13_组合模式.sample_1.leaf.Leaf;

public class Test {
    public static void main(String[] args) {
        //构造一个根节点
        Composite root = new Composite("root");
        //构造两个枝干节点
        Composite branch1 = new Composite("Branch1");
        Composite branch2 = new Composite("Branch2");
        //构造两个叶子节点
        Leaf leadf1 = new Leaf("Leaf1");
        Leaf leadf2 = new Leaf("Leaf2");
        //将叶子节点添加到枝干节点中
        branch1.addChild(leadf1);
        branch2.addChild(leadf2);
        //将枝干节点添加到根节点中
        root.addChild(branch1);
        root.addChild(branch2);
        //执行方法
        root.showName();
    }
}
