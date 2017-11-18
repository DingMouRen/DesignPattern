package design12_迭代器模式;

import design12_迭代器模式.aggregate.Aggregate;
import design12_迭代器模式.aggregate.ConcreteAggregate;
import design12_迭代器模式.iterator.Iterator;

public class Test {
    public static void main(String[] args) {
        Aggregate<Integer> aggregate = new ConcreteAggregate<>();
        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);
        aggregate.add(4);
        Iterator<Integer> integerIterator = aggregate.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
