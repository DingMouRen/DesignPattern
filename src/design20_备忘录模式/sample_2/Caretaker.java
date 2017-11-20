package design20_备忘录模式.sample_2;
//管理者  管理备忘录
public class Caretaker {
    private Memoto memoto;//备忘录
    //存档
    public void saveMemoto(Memoto memoto){
        this.memoto = memoto;
    }
    //获取存档

    public Memoto getMemoto() {
        return memoto;
    }
}
