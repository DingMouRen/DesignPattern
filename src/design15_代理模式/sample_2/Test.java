package design15_代理模式.sample_2;

import design15_代理模式.sample_2.dynamicProxy.DynamicProxy;
import design15_代理模式.sample_2.proxy.Lawer;
import design15_代理模式.sample_2.realSubject.PersonA;
import design15_代理模式.sample_2.realSubject.PersonB;
import design15_代理模式.sample_2.subject.ILawsuit;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        /**
         * 静态代理
         */
        //构造一个要诉讼的公民
        PersonA personA = new PersonA();
        //公民找到律师
        Lawer lawer = new Lawer(personA);
        //律师完全代理诉讼的整个过程
        System.out.println("静态代理");
        lawer.submit();
        lawer.burden();
        lawer.defend();
        lawer.finish();

        /**
         * 动态代理
         */
        ILawsuit personB = new PersonB();
        DynamicProxy dynamicProxy = new DynamicProxy(personB);
        ClassLoader classLoader = personB.getClass().getClassLoader();
        ILawsuit lawsuit = (ILawsuit) Proxy.newProxyInstance(classLoader,new Class[]{ILawsuit.class},dynamicProxy);

        System.out.println("\n动态代理");
        lawsuit.submit();
        lawsuit.burden();
        lawsuit.defend();
        lawsuit.finish();
    }
}
