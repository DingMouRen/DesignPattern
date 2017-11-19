package design20_备忘录模式.sample_2;
//相当于Originator,
public class Game {
    private int checkPoint = 1;//游戏第一关
    private int lifeValue = 100;//刚开始血量满满
    private String weapon = "匕首";//武器

    //开始游戏
    public void play(){
        System.out.println("开始游戏："+String.format("第%d关",checkPoint)+"  fighting!! ︻$▅▆▇◤");
        lifeValue -= 10;
        System.out.println("闯关成功");
        checkPoint++;
        System.out.println("到达"+String.format("第%d关",checkPoint));
    }

    //退出游戏
    public void quit(){
        System.out.println(". . . . . .");
        System.out.println(this.toString()+"\n退出游戏");
    }

    //创建备忘录
    public Memoto createMemoto(){
        Memoto memoto = new Memoto();
        memoto.setCheckPoint(this.checkPoint);
        memoto.setLifeValue(lifeValue);
        memoto.setWeapon(weapon);
        return memoto;
    }

    //恢复游戏
    public void restore(Memoto memoto){
        this.checkPoint = memoto.getCheckPoint();
        this.lifeValue = memoto.getLifeValue();
        this.weapon = memoto.getWeapon();
        System.out.println("恢复后的游戏状态："+this.toString());
    }

    @Override
    public String toString() {
        return "当前游戏关数:"+checkPoint+"  血量："+lifeValue+" 武器："+weapon;
    }
}
