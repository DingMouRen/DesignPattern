package design19_中介者模式.sample_2;

import design19_中介者模式.sample_2.conreteColleague.CDDevice;
import design19_中介者模式.sample_2.conreteColleague.CPU;
import design19_中介者模式.sample_2.conreteColleague.GraphicsCard;
import design19_中介者模式.sample_2.conreteColleague.SoundCard;
import design19_中介者模式.sample_2.conreteMediator.MainBoard;

public class Test {
    public static void main(String[] args) {
        //构造主板：具体中介者
        MainBoard mediator = new MainBoard();
        //分别构造其他的部件
        CDDevice cdDevice = new CDDevice(mediator);
        CPU cpu = new CPU(mediator);
        GraphicsCard graphicsCard = new GraphicsCard(mediator);
        SoundCard soundCard = new SoundCard(mediator);
        //将部件设置到主板，分别与中介者创建联系
        mediator.setCdDevice(cdDevice);
        mediator.setCpu(cpu);
        mediator.setGraphicsCard(graphicsCard);
        mediator.setSoundCard(soundCard);
        //只要开始加载数据，具体中介者主板就可以协调它们来工作
        cdDevice.load();
    }
}
