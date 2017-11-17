package design12_迭代器模式.aggregate;

import design12_迭代器模式.iterator.Iterator;

//容器接口
public interface Aggregate<T> {
    //添加元素
    void add(T obj);
    //移除元素
    void remove(T obj);
    //获取迭代器对象
    Iterator<T> iterator();
}
