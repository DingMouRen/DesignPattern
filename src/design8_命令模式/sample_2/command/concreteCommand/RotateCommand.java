package design8_命令模式.sample_2.command.concreteCommand;

import design8_命令模式.sample_2.MachineTetris;
import design8_命令模式.sample_2.command.abstractCommand.Command;
//具体命令类:旋转得命令
public class RotateCommand implements Command {
    private MachineTetris machineTetris;

    public RotateCommand(MachineTetris machineTetris) {
        this.machineTetris = machineTetris;
    }

    @Override
    public void execute() {
        machineTetris.toRotate();
    }
}
