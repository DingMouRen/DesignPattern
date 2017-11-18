package design8_命令模式.sample_1;

import design8_命令模式.sample_1.command.Command;
import design8_命令模式.sample_1.command.ConcreteCommand;

public class Test {
    public static void main(String[] args) {
        //创建一个接收者对象
        Receiver receiver = new Receiver();
        //根据接收者对象创建一个命令对象
        Command command = new ConcreteCommand(receiver);
        //根据具体对象创建请求者对象
        Invoker invoker = new Invoker(command);
        //执行请求的方法
        invoker.action();
    }
}
