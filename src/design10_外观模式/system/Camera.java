package design10_外观模式.system;
//子系统抽象接口：拍照系统
public interface Camera {
    //打开相机系统
    void open();
    //拍照
    void takePhoto();
    //关闭相机系统
    void close();
}
