package design10_外观模式;

import design10_外观模式.concreteSystem.PhoneImpl;
import design10_外观模式.concreteSystem.SonyCamera;
import design10_外观模式.system.Camera;
import design10_外观模式.system.Phone;

//Facade类:外观类
public class MobilePhone {
    private Phone phone = new PhoneImpl();
    private Camera camera = new SonyCamera();

    //用手机打电话
    public void dail(){
        phone.dail();
    }
    //挂断电话
    public void hangup(){
        phone.hangup();
    }
    //用手机拍照片
    public void takePhoto(){
        camera.open();
        camera.takePhoto();
    }
    //退出相机
    public void closeCamera(){
        camera.close();
    }
}
