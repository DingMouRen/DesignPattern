package design17_责任链模式.sample_1.concreteRequest;

import design17_责任链模式.sample_1.abstractRequest.AbstractRequest;
//具体请求者
public class Request1 extends AbstractRequest {
    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
