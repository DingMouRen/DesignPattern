package design11_模板方法模式.concreteImpl;

import design11_模板方法模式.AbstractComputer;

//子类来实现算法中的某些步骤
public class CoderComputer extends AbstractComputer {
    @Override
    protected void checkHardware() {
        System.out.println(getClass().getSimpleName()+"检查硬件");
    }

    @Override
    protected void loadOS() {
        System.out.println(getClass().getSimpleName()+"加载linux系统");
    }

    @Override
    protected void login() {
        System.out.println(getClass().getSimpleName()+"进行用户和密码验证");
    }
}
