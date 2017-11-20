package design19_中介者模式.sample_2.conreteColleague;

import design19_中介者模式.sample_2.colleague.Colleague;
import design19_中介者模式.sample_2.mediator.Mediator;
//具体同事类 ： cpu
public class CPU extends Colleague {
    private String dataVideo,dataSound;//视频和音频数据
    public CPU(Mediator mediator) {
        super(mediator);
    }

    //解码数据
    public void decodeData(String data){
        String[] tmp = data.split(",");
        dataVideo = tmp[0];
        dataSound = tmp[1];
        //数据解析结束后，向中介者发送请求，通知中介者
        mediator.changed(this);
    }

    public String getDataVideo() {
        return dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }
}
