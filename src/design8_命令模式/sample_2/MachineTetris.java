package design8_命令模式.sample_2;
//接收者类：俄罗斯方块游戏
public class MachineTetris {
    //方块向左移动的逻辑代码
    public void toLeft(){
        System.out.println("向左");
    }
    //方块向右移动的逻辑代码
    public void toRight(){
        System.out.println("向右");
    }
    //方块快速落下的逻辑代码
    public void toBottom(){
        System.out.println("快速下落");
    }
    //方块旋转的逻辑代码
    public void toRotate(){
        System.out.println("旋转");
    }
}
