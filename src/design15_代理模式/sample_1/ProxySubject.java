package design15_代理模式.sample_1;
//代理类
public class ProxySubject extends Subject{
    private Subject realSubject;//持有真实主题类的引用

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void visit() {
        //通过真实主题引用对象调用真实主题中的逻辑方法
        realSubject.visit();
    }
}
