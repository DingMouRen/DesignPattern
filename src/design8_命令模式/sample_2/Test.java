package design8_命令模式.sample_2;

import design8_命令模式.sample_2.command.concreteCommand.DownCommand;
import design8_命令模式.sample_2.command.concreteCommand.LeftCommand;
import design8_命令模式.sample_2.command.concreteCommand.RightCommand;
import design8_命令模式.sample_2.command.concreteCommand.RotateCommand;

public class Test {
    public static void main(String[] args) {
        //要有一个方块游戏
        MachineTetris machineTetris = new MachineTetris();
        //根据游戏构造4个命令
        LeftCommand leftCommand = new LeftCommand(machineTetris);
        RightCommand rightCommand = new RightCommand(machineTetris);
        DownCommand downCommand = new DownCommand(machineTetris);
        RotateCommand rotateCommand = new RotateCommand(machineTetris);
        //给按钮设置相关命令
        Buttons buttons = new Buttons();
        buttons.setLeftCommand(leftCommand);
        buttons.setRightCommand(rightCommand);
        buttons.setDownCommand(downCommand);
        buttons.setRotateCommand(rotateCommand);
        //可以玩耍啦
        buttons.toBottom();
        buttons.toRight();
    }
}
