package design10_外观模式;

public class Test {
    public static void main(String[] args) {
        //拿到手机对象
        MobilePhone phone = new MobilePhone();
        //随便打电话或者去拍照
        phone.takePhoto();
    }
}
