package design17_责任链模式.sample_1.abstractHandler;

import design17_责任链模式.sample_1.abstractRequest.AbstractRequest;

//抽象处理者:声明了处理者对象处理请求的方法和获取处理级别的方法，并对具体的处理转发逻辑进行了实现
public abstract class AbstractHandler {
    public AbstractHandler nextHandler;//下一节点上的处理者对象
    //处理请求
    public final void handleRequest(AbstractRequest request){
        /*
        判断当前处理者对象的处理级别是否与请求者对象的处理级别一致，
        一致的话，就交给当前处理者对象进行处理
        不一致，就将该请求对象转发给下一个节点上的处理者对象
        当所有处理者对象都不能处理该请求时输出
         */
        if (getHandleLevel() == request.getRequestLevel()){
            handle(request);
        }else {
            if (nextHandler != null)
                nextHandler.handleRequest(request);
            else
                System.out.println("没有处理者对象能够处理这个请求");
        }
    }
    //获取处理者对象的处理级别
    protected abstract int getHandleLevel();

    //每一个处理者对象的具体处理方式
    protected abstract void handle(AbstractRequest request);
}
