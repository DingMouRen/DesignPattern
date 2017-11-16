package design4_装饰者模式.sample_2.decorator;

import design4_装饰者模式.sample_2.component.Person;
//具体装饰者
public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    @Override
    public void dressed() {
        //原来具体组件实现
        super.dressed();
        //添加的新行为的具体实现
        dressJean();
        dressShirt();
    }

    private void dressShirt(){
        System.out.println(getPerson().getClass().getSimpleName()+"穿短袖");
    }

    private void dressJean(){
        System.out.println(getPerson().getClass().getSimpleName()+"穿牛仔裤");
    }
}
