package design15_代理模式.sample_2.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//动态代理类：通过反射机制动态地生成代理者的对象
public class DynamicProxy implements InvocationHandler {
    private Object obj;//被代理类的引用

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用被代理类对象的方法
        Object result = method.invoke(obj,args);
        return result;
    }
}
