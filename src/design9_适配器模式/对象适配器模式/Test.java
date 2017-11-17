package design9_适配器模式.对象适配器模式;

import design9_适配器模式.对象适配器模式.adaptee.Volt220;
import design9_适配器模式.对象适配器模式.adapter.VoltAdapter;

public class Test {
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        adapter.get5V();
    }
}
