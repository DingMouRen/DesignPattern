package design14_状态模式;

public class Test {
    public static void main(String[] args) {
        //先获取一个电视遥控器对象
        ControllerTv controllerTv = new ControllerTv();
        //设置开机状态
        controllerTv.powerOn();
        //随便玩耍
        controllerTv.nextChannel();
        controllerTv.turnUp();
        controllerTv.powerOff();
        controllerTv.nextChannel();
    }
}
