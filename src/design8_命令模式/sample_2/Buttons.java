package design8_命令模式.sample_2;

import design8_命令模式.sample_2.command.concreteCommand.DownCommand;
import design8_命令模式.sample_2.command.concreteCommand.LeftCommand;
import design8_命令模式.sample_2.command.concreteCommand.RightCommand;
import design8_命令模式.sample_2.command.concreteCommand.RotateCommand;

//请求者类
public class Buttons {
    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private DownCommand downCommand;
    private RotateCommand rotateCommand;

    //在按钮上设置命令
    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setDownCommand(DownCommand downCommand) {
        this.downCommand = downCommand;
    }

    public void setRotateCommand(RotateCommand rotateCommand) {
        this.rotateCommand = rotateCommand;
    }

    //按下按钮，执行对应的行为
    public void toLeft(){
        leftCommand.execute();
    }
    public void toRight(){
        rightCommand.execute();
    }
    public void toBottom(){
        downCommand.execute();
    }
    public void toRotate(){
        rotateCommand.execute();
    }
}
