package design12_迭代器模式.iterator;

import java.util.ArrayList;
import java.util.List;

//具体迭代器类
public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list = new ArrayList<>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()) obj = this.list.get(cursor++);
        return obj;
    }
}
