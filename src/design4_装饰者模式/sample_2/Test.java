package design4_装饰者模式.sample_2;

import design4_装饰者模式.sample_2.component.Boy;
import design4_装饰者模式.sample_2.component.Girl;
import design4_装饰者模式.sample_2.component.Person;
import design4_装饰者模式.sample_2.decorator.CheapCloth;
import design4_装饰者模式.sample_2.decorator.ExpensiveCloth;
import design4_装饰者模式.sample_2.decorator.PersonCloth;

public class Test {
    public static void main(String[] args) {
        //创建被装饰对象
        Person person = new Boy();
        //给他穿便宜衣服
        PersonCloth clothCheap = new CheapCloth(person);
        clothCheap.dressed();
        //穿贵的衣服
        PersonCloth clothExpensive = new ExpensiveCloth(person);
        clothExpensive.dressed();


        Person girl = new Girl();
        PersonCloth clothCheapGirl = new CheapCloth(girl);
        clothCheapGirl.dressed();
    }
}
