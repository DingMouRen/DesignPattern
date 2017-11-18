package design9_适配器模式.对象适配器模式.adapter;

import design9_适配器模式.对象适配器模式.adaptee.Volt220;
import design9_适配器模式.对象适配器模式.target.Volt5;

//Adapter类，
public class VoltAdapter  implements Volt5{

    private Volt220 volt220;//持有需要转换的对象的引用

    public VoltAdapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    public int get220V(){
        return volt220.get220V();
    }

    @Override
    public int get5V() {
        return 0;
    }
}
