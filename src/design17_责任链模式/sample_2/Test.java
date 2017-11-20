package design17_责任链模式.sample_2;

import design17_责任链模式.sample_2.abstractHandler.Leader;
import design17_责任链模式.sample_2.concreteHandler.Boss;
import design17_责任链模式.sample_2.concreteHandler.Director;
import design17_责任链模式.sample_2.concreteHandler.GroupLeader;
import design17_责任链模式.sample_2.concreteHandler.Manager;

public class Test {
    public static void main(String[] args) {
        //构建处理者对象：领导们
        Leader groupLeader = new GroupLeader();
        Leader directorLeader = new Director();
        Leader managerLeader = new Manager();
        Leader  boss = new Boss();
        //设置处理的责任链关系
        groupLeader.nextLeader = directorLeader;
        directorLeader.nextLeader = managerLeader;
        managerLeader.nextLeader = boss;
        //发起报账的请求
        groupLeader.handleRequest(3000);
    }
}
