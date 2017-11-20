package design22_访问者模式;

import design22_访问者模式.element.Staff;
import design22_访问者模式.elementConcrete.Engineer;
import design22_访问者模式.elementConcrete.Manager;
import design22_访问者模式.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

//对象结构类
public class BusinessReport {
    List<Staff> staffs = new LinkedList<>();

    public BusinessReport() {
        staffs.add(new Manager("王经理"));
        staffs.add(new Manager("向经理"));
        staffs.add(new Engineer("工程师--Jim"));
        staffs.add(new Engineer("工程师--Jack"));
        staffs.add(new Engineer("工程师--Jvm"));
    }

    //为访问者展示报表
    public void showReport(Visitor visitor){
        for (Staff staff : staffs){
            staff.accept(visitor);
        }
    }
}
