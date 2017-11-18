package design10_外观模式.concreteSystem;

import design10_外观模式.system.Camera;

//拍照系统的具体实现类：索尼的相机
public class SonyCamera implements Camera{
    @Override
    public void open() {
        System.out.println("打开拍照系统");
    }

    @Override
    public void takePhoto() {
        System.out.println("通过拍照系统拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭拍照系统");
    }
}
