package design12_迭代器模式.iterator;
//迭代器接口
public interface Iterator<T> {
    //是否有下一个元素
    boolean hasNext();
    //返回当前位置的元素，并将位置移到下一位
    T next();
}
