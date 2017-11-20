package design23_享元模式;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//享元工厂
public class TicketFactory {
  public static Map<String,Ticket> ticketMap = new ConcurrentHashMap<>();

  public static Ticket getTicket(String from,String to){
      String key = from + "-" +to;
      if (ticketMap.containsKey(key)){
          System.out.println("使用缓存---"+key);
          return ticketMap.get(key);
      }else {
          System.out.println("创建新的对象，并存储到集合---"+key);
          Ticket ticket = new TrainTicket(from,to);
          ticketMap.put(key,ticket);
          return ticket;
      }
  }
}
