package design19_中介者模式.sample_2.conreteColleague;

import design19_中介者模式.sample_2.colleague.Colleague;
import design19_中介者模式.sample_2.mediator.Mediator;
//具体同事类：显卡用来播放视频
public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }

    //播放视频
    public void videoPlay(String dataVideo){
        System.out.println(getClass().getSimpleName()+"播放"+dataVideo);
    }
}
