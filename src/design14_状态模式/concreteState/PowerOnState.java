package design14_状态模式.concreteState;

import design14_状态模式.state.TvState;
//具体状态类：开机状态
public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println(getClass().getSimpleName()+"：下一个频道");
    }

    @Override
    public void preChannel() {
        System.out.println(getClass().getSimpleName()+"：上一个频道");

    }

    @Override
    public void turnUp() {
        System.out.println(getClass().getSimpleName()+"：调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println(getClass().getSimpleName()+"：调低音量");
    }
}
