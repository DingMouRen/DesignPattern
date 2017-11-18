package design4_装饰者模式.sample_2.component;
//组件具体实现类：需要被装饰的具体对象
public class Boy extends Person {
    @Override
    public void dressed() {
        System.out.println(getClass().getSimpleName()+"穿牛仔褂");
    }
}
