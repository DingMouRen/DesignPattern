package design8_命令模式.sample_2.command.concreteCommand;

import design8_命令模式.sample_2.MachineTetris;
import design8_命令模式.sample_2.command.abstractCommand.Command;
//具体命令类：向右移动的命令
public class RightCommand implements Command {
    //持有接收者方块游戏的引用，便于调用接收者的方法
    private MachineTetris machineTetris;

    public RightCommand(MachineTetris machineTetris) {
        this.machineTetris = machineTetris;
    }

    @Override
    public void execute() {
        machineTetris.toRight();//在执行命令的方法中，调用向右移动的方法
    }
}
