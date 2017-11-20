package design22_访问者模式.visitorConcrete;

import design22_访问者模式.element.Staff;
import design22_访问者模式.elementConcrete.Engineer;
import design22_访问者模式.elementConcrete.Manager;
import design22_访问者模式.visitor.Visitor;
//具体访问者：ceo
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Staff staff) {
        if (staff instanceof Engineer){
            Engineer engineer = (Engineer) staff;
            System.out.println("CEO对"+engineer.name+"数据访问并作出自己的评语");
        }else if (staff instanceof Manager){
            Manager manager = (Manager) staff;
            System.out.println("CEO对"+manager.name+"数据访问并作出自己的评语");
        }
    }
}
