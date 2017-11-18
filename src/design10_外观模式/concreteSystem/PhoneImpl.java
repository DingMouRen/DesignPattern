package design10_外观模式.concreteSystem;

import design10_外观模式.system.Phone;

//通话系统的具体实现类
public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("通话系统的打电话功能");
    }

    @Override
    public void hangup() {
        System.out.println("通话系统的关闭通话");
    }
}
