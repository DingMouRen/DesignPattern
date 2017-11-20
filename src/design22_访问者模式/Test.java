package design22_访问者模式;

import design22_访问者模式.visitorConcrete.CEOVisitor;
import design22_访问者模式.visitorConcrete.CTOVisitor;

public class Test {
    public static void main(String[] args) {
        //构建报表对象
        BusinessReport report = new BusinessReport();
        //设置访问者
        report.showReport(new CEOVisitor());
        System.out.println("- - - - ");
        report.showReport(new CTOVisitor());
    }
}
