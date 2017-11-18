package design4_装饰者模式.sample_2.component;
//组件具体实现类：被装饰的具体对象
public class Girl  extends Person{

    @Override
    public void dressed() {
        System.out.println(getClass().getSimpleName()+"穿短裙");
    }
}
