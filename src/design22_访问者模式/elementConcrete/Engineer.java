package design22_访问者模式.elementConcrete;

import design22_访问者模式.element.Staff;
import design22_访问者模式.visitor.Visitor;

import java.util.Random;
import java.util.Stack;

//具体元素类：工程师
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //工程师一年写的代码量
    public int getCodeLines(){
        return new Random().nextInt(10 * 1000);
    }
}
