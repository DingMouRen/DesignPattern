package design11_模板方法模式;

import design11_模板方法模式.concreteImpl.CoderComputer;
import design11_模板方法模式.concreteImpl.MilitaryComputer;

public class Test {
    public static void main(String[] args) {
        AbstractComputer computer = new CoderComputer();
        computer.startUp();

        computer = new MilitaryComputer();
        computer.startUp();
    }
}
