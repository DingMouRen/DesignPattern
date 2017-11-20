package design19_中介者模式.sample_2.conreteMediator;

import design19_中介者模式.sample_2.colleague.Colleague;
import design19_中介者模式.sample_2.conreteColleague.CDDevice;
import design19_中介者模式.sample_2.conreteColleague.CPU;
import design19_中介者模式.sample_2.conreteColleague.GraphicsCard;
import design19_中介者模式.sample_2.conreteColleague.SoundCard;
import design19_中介者模式.sample_2.mediator.Mediator;
//具体中介者  主板负责将CPU 显卡  声卡集合到一起，负责它们之间的联系
public class MainBoard extends Mediator {
    private CDDevice cdDevice;//光驱
    private CPU cpu;
    private SoundCard soundCard;//声卡
    private GraphicsCard graphicsCard;//显卡
    @Override
    public void changed(Colleague colleague) {
        //如果光驱加载完数据，就处理CD,如果是cpu，就处理cpu
        if (colleague == cdDevice){
            handleCD(cdDevice);
        }else if (colleague == cpu){
            handleCPU((CPU) colleague);
        }
    }

    //处理光驱读取的数据后，再与其他设备交互
    private void handleCD(CDDevice cdDevice){
        cpu.decodeData(cdDevice.read());
    }

    //处理cpu读取的数据后，再与其他设备交互
    private void handleCPU(CPU cpu){
        soundCard.soundPlay(cpu.getDataSound());
        graphicsCard.videoPlay(cpu.getDataVideo());
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }
}
