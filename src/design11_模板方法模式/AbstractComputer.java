package design11_模板方法模式;
//Template模板类
public abstract class AbstractComputer {
    //启动计算机固定步骤：开启电源、硬件检查、加载系统、用户登录，用final休息，不让子类修改
    public final void startUp(){
        powerOn();
        checkHardware();
        loadOS();
        login();
        hook();//钩子
        System.out.println("登录后。。。。。。，然后就关机了");
    }

    private void powerOn() {
        System.out.println("开启电源");
    }

    //检查硬件
    protected abstract void checkHardware();

    //加载系统
    protected abstract void loadOS();

    //用户登录
    protected abstract void login();

    /**
     * 钩子：默认不做事的方法，子类根据情况决定要不要覆盖。
     * 例子：假如算法模板中有一个方法需要在一个条件允许下才能执行，这里hook()返回boolean值，这里hook()方法的实现就是去检验
     * 条件是否允许
     */
    protected  void hook(){

    }
}
