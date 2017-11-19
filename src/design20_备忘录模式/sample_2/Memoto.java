package design20_备忘录模式.sample_2;
//备忘录类
public class Memoto {
    private int checkPoint;//关数
    private int lifeValue;//血量
    private String weapon;//武器

    public int getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(int checkPoint) {
        this.checkPoint = checkPoint;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        this.lifeValue = lifeValue;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    @Override
    public String toString() {
        return "备忘录中存储的游戏关数:"+checkPoint+"  血量："+lifeValue+" 武器："+weapon;
    }
}
