package design8_命令模式.sample_2.command.concreteCommand;

import design8_命令模式.sample_2.MachineTetris;
import design8_命令模式.sample_2.command.abstractCommand.Command;
//具体命令类：快速下落的命令
public class DownCommand implements Command {
    private MachineTetris machineTetris;

    public DownCommand(MachineTetris machineTetris) {
        this.machineTetris = machineTetris;
    }

    @Override
    public void execute() {
        machineTetris.toBottom();
    }
}
