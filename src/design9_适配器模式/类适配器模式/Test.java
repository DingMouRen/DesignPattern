package design9_适配器模式.类适配器模式;

import design9_适配器模式.类适配器模式.adapter.Volt220To5Adapter;

public class Test {
    public static void main(String[] args) {
        Volt220To5Adapter adapter = new Volt220To5Adapter();
        adapter.get5V();
    }
}
