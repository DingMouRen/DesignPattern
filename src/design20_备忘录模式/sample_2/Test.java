package design20_备忘录模式.sample_2;

public class Test {
    public static void main(String[] args) {
        //构建游戏对象
        Game game = new Game();
        //构建管理者
        Caretaker caretaker =  new Caretaker();
        //开始游戏
        game.play();
        //游戏存档
        caretaker.saveMemoto(game.createMemoto());
        //退出游戏
        game.quit();
        //进入游戏时，恢复上一次游戏的状态
        Game newGame = new Game();
        System.out.println("登录游戏");
        newGame.restore(caretaker.getMemoto());
    }
}
