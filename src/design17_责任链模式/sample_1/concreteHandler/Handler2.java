package design17_责任链模式.sample_1.concreteHandler;

import design17_责任链模式.sample_1.abstractHandler.AbstractHandler;
import design17_责任链模式.sample_1.abstractRequest.AbstractRequest;
//具体处理者
public class Handler2 extends AbstractHandler {
    @Override
    protected int getHandleLevel() {
        return 2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println(getClass().getSimpleName()+"处理的请求级别："+request.getRequestLevel());
    }
}
