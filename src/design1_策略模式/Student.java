package design1_策略模式;

import design1_策略模式.interface_stragety.Stragety;

//学生
public class Student {
    private Stragety stragety;//策略的抽象，也可以称作泛化

    public Student(Stragety stragety) {
        this.stragety = stragety;
    }

    /**
     * 获取数字6
     */
    public void getNumberSix(){
        int result = stragety.calculate();
        System.out.println(result == 6 ? "获取的数字正确":"获取的数字不正确，获取到的数字是"+result);
    }

    /**
     * 可以动态的更换策略
     * @param stragety
     */
    public void setStragety(Stragety stragety) {
        this.stragety = stragety;
    }

}
