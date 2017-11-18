package design4_装饰者模式.sample_2.decorator;

import design4_装饰者模式.sample_2.component.Person;
//装饰抽象类：表示人要穿的衣服
public abstract class PersonCloth  extends Person{
    /**
     * 保持一个Person类的引用，方便调用具体被装饰对象中的方法
     * 这样可以在不破坏原类层次结构的情况下为类添加一些功能，只需要在被装饰对象的相应方法
     * 前或后增加相应的逻辑功能就行。
     * 如果装饰物只有一个的话，不必声明一个抽象类作为装饰者抽象的提取。只要定义一个普通的类表示装饰者就行
     */
    private Person person;

    public PersonCloth(Person person) {
        this.person = person;
    }

    @Override
    public void dressed() {
        person.dressed();//调用Person类型的dressed（）方法
    }

    public Person getPerson() {
        return person;
    }
}
