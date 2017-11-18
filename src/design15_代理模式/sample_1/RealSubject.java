package design15_代理模式.sample_1;

//真实主题类，被代理的类
public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.println(getClass().getSimpleName()+"->visit");
    }
}
