package design8_命令模式.sample_1;

import design8_命令模式.sample_1.command.Command;

//请求者类
public class Invoker {
    private Command command;//持有一个相应命令对象的引用

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();//调用命令对象的方法，执行具体命令
    }
}
