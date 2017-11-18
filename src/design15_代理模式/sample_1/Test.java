package design15_代理模式.sample_1;

public class Test {
    public static void main(String[] args) {
        //构造真实对象
        RealSubject realSubject = new RealSubject();
        //通过真实对象构造一个代理对象
        ProxySubject proxySubject = new ProxySubject(realSubject);
        //调用代理的相关方法
        proxySubject.visit();
    }
}
