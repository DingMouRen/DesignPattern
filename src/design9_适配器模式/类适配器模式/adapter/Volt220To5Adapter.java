package design9_适配器模式.类适配器模式.adapter;

import design9_适配器模式.类适配器模式.adaptee.Volt220;
import design9_适配器模式.类适配器模式.target.Volt5;
//Adapter适配器类，将220V转换成5V
public class Volt220To5Adapter extends Volt220 implements Volt5 {
    @Override
    public int get5V() {
        return 5;
    }
}
