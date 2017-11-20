package design19_中介者模式.sample_2.conreteColleague;

import design19_中介者模式.sample_2.colleague.Colleague;
import design19_中介者模式.sample_2.mediator.Mediator;
//具体同事类  声卡用来播放音频
public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }
    //播放音频
    public void soundPlay(String dataSound){
        System.out.println(getClass().getSimpleName()+"播放"+dataSound);
    }
}
