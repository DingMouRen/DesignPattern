package design7_单例模式;
/**
 * 双重检查锁，首先检查实例是否创建了，如果没有创建再进行同步。这样的话，
 * 只有在第一次调用的时候才会进行同步，这个方式适用于jdk1.5之后的版本
 */
public class Singleton3 {
    private volatile static Singleton3 instance;//volatile关键词确保：在instance变量被初始化Singleton实例时，多个线程正确的处理instance变量
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if (instance == null){
            synchronized (Singleton3.class){
                if (instance == null) instance = new Singleton3();
            }
        }
        return instance;
    }
}
