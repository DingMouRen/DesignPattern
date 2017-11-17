package design8_命令模式.sample_1.command;

import design8_命令模式.sample_1.Receiver;

//具体命令类
public class ConcreteCommand implements Command {
    private Receiver receiver;//这里持有一个接收者对象的引用

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();//这里调用接收者的方法来执行具体的逻辑
    }
}
