package design8_命令模式.sample_1;
//接收者类
public class Receiver {
    //真正执行具体命令逻辑的方法
    public void action(){
        System.out.println(getClass().getSimpleName()+"执行具体操作");
    }
}
