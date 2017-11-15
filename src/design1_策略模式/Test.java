package design1_策略模式;

import design1_策略模式.impl_stragety.StargetyMultiply;
import design1_策略模式.impl_stragety.StragetyAdd;

public class Test {
    public static void main(String[] args) {
        //创建对象
        Student student = new Student(new StragetyAdd());
        //获取到数字6
        student.getNumberSix();
        //动态更换策略
        student.setStragety(new StargetyMultiply());
        student.getNumberSix();
    }
}
