package design22_访问者模式.visitor;

import design22_访问者模式.element.Staff;
import design22_访问者模式.elementConcrete.Engineer;
import design22_访问者模式.elementConcrete.Manager;

//抽象访问者
public interface Visitor {
    void visit(Staff staff);
}
