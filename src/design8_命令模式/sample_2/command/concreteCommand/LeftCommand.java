package design8_命令模式.sample_2.command.concreteCommand;

import design8_命令模式.sample_2.MachineTetris;
import design8_命令模式.sample_2.command.abstractCommand.Command;

//具体命令类：向左移动的命令
public class LeftCommand implements Command {
    //持有接收者方块游戏的引用
    private MachineTetris machineTetris;

    public LeftCommand(MachineTetris machineTetris) {
        this.machineTetris = machineTetris;
    }

    @Override
    public void execute() {
        machineTetris.toLeft();//在命令执行的方法里，调用向左移动的方法
    }
}
