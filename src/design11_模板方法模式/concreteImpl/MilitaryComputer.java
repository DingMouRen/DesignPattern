package design11_模板方法模式.concreteImpl;

import design11_模板方法模式.AbstractComputer;

//子类实现算法的某些步骤
public class MilitaryComputer extends AbstractComputer{
    @Override
    protected void checkHardware() {
        System.out.println(getClass().getSimpleName()+"检查硬件");
    }

    @Override
    protected void loadOS() {
        System.out.println(getClass().getSimpleName()+"加载军用系统");

    }

    @Override
    protected void login() {
        System.out.println(getClass().getSimpleName()+"军人身份认证");
    }
}
