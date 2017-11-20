package design23_享元模式;

import java.util.Random;

//具体的享元对象：火车票
public class TrainTicket implements Ticket {
    public String from;//始发地
    public String to;//目的地
    public String bunk;//铺位
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        this.bunk = bunk;
        price = new Random().nextInt(300);
        System.out.println("火车票从"+from+"到"+to+",铺位："+bunk+",价格："+price+"  哈希值："+this.hashCode());
    }
}
