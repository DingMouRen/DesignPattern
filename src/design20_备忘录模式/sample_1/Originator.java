package design20_备忘录模式.sample_1;
//原发器 负责创建一个备忘录
public class Originator {
    private String state ;
    //创建一个备忘录
    public Memeto createMemento(){
        return new Memeto(this.state);
    }
    //恢复到上一次的状态
    public void restoreMemento(Memeto memeto){
        this.setState(memeto.getState());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
