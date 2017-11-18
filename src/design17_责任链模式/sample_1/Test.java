package design17_责任链模式.sample_1;

import design17_责任链模式.sample_1.abstractHandler.AbstractHandler;
import design17_责任链模式.sample_1.abstractRequest.AbstractRequest;
import design17_责任链模式.sample_1.concreteHandler.Handler1;
import design17_责任链模式.sample_1.concreteHandler.Handler2;
import design17_责任链模式.sample_1.concreteHandler.Handler3;
import design17_责任链模式.sample_1.concreteRequest.Request1;
import design17_责任链模式.sample_1.concreteRequest.Request2;
import design17_责任链模式.sample_1.concreteRequest.Request3;

public class Test {
    public static void main(String[] args) {
        //构造三个处理者对象
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();
        //将处理者对象像链子一样连接起来
        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;
        handler3.nextHandler = null;
        //构造三个请求者对象
        AbstractRequest request1 = new Request1("Request1");
        AbstractRequest request2 = new Request2("Request2");
        AbstractRequest request3 = new Request3("Request3");
        //处理请求总是从链式的首端发起请求
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}
