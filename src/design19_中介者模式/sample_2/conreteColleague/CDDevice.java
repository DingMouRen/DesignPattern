package design19_中介者模式.sample_2.conreteColleague;

import design19_中介者模式.sample_2.colleague.Colleague;
import design19_中介者模式.sample_2.mediator.Mediator;
//具体同事  光驱负责读取光盘数据并将数据提供给主板
public class CDDevice extends Colleague {
    private String data;//光盘上的数据
    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    //加载视频数据
    public void load(){
        data = "视频数据,音频数据";
        //数据已经加载完毕，通知中介者，主板数据改变
        mediator.changed(this);
    }

    //读取视频数据
    public String read(){
        return data;
    }
}
