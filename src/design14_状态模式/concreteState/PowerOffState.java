package design14_状态模式.concreteState;

import design14_状态模式.state.TvState;

//具体状态类：关机状态
public class PowerOffState implements TvState{
    @Override
    public void nextChannel() {
        System.out.println("处于关机状态，关机在屏幕上是没有提示的哦");
    }

    @Override
    public void preChannel() {
        System.out.println("处于关机状态，关机在屏幕上是没有提示的哦");
    }

    @Override
    public void turnUp() {
        System.out.println("处于关机状态，关机在屏幕上是没有提示的哦");
    }

    @Override
    public void turnDown() {
        System.out.println("处于关机状态，关机在屏幕上是没有提示的哦");
    }
}
