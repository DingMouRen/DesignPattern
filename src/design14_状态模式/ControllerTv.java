package design14_状态模式;

import design14_状态模式.concreteState.PowerOffState;
import design14_状态模式.concreteState.PowerOnState;
import design14_状态模式.state.TvState;

//电视遥控器
public class ControllerTv {
    private TvState tvState;//持有状态类的引用，便于调用状态类的方法

    //设置状态
    private void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    //设置开机状态
    public void powerOn(){
        setTvState(new PowerOnState());
        System.out.println("开机咯");
    }

    //设置关机状态
    public void powerOff(){
        setTvState(new PowerOffState());
        System.out.println("关机了，欢迎再来哈");
    }

    public void nextChannel(){
        tvState.nextChannel();
    }

    public void preChannel(){
        tvState.preChannel();
    }

    public void turnUp(){
        tvState.turnUp();
    }

    public void turnDown(){
        tvState.turnDown();
    }
}
