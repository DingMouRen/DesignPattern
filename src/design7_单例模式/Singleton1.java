package design7_单例模式;
//懒汉式：在第一次调用时才会进行初始化，缺点：每一次都会有同步的操作，如果调用频繁的话，这种做法会很消耗性能
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static synchronized Singleton1 getInstance(){
        if (instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
