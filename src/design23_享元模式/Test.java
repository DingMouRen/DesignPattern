package design23_享元模式;

public class Test {
    public static void main(String[] args) {
        Ticket ticket1 = TicketFactory.getTicket("济南","杭州");
        ticket1.showTicketInfo("上铺");
        Ticket ticket2 = TicketFactory.getTicket("济南","杭州");
        ticket2.showTicketInfo("中铺");
        Ticket ticket3 = TicketFactory.getTicket("济南","杭州");
        ticket3.showTicketInfo("下铺");
    }
}
