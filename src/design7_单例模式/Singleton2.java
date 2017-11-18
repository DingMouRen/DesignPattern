package design7_单例模式;
//饿汉式：会一直占用着资源
public class Singleton2 {
    private static final Singleton2 instance = new Singleton2();
    private Singleton2(){}
    public static Singleton2 getInstance(){
        return instance;
    }
}
