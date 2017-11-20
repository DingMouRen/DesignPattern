package design20_备忘录模式.sample_1;

public class Test {
    public static void main(String[] args) {
        //构造发起者对象
        Originator originator = new Originator();
        originator.setState("状态1");
        //构造管理者
        Caretaker caretaker = new Caretaker();
        caretaker.setMemeto(originator.createMemento());

        originator.setState("状态2");
        System.out.println("改变后的状态："+originator.getState());
        //返回上一次的状态
        originator.restoreMemento(caretaker.getMemeto());
        System.out.println("恢复后的状态："+originator.getState());
    }
}
