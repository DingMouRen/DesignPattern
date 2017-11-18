package design17_责任链模式.sample_1.abstractRequest;
//抽象请求者
public abstract class AbstractRequest {
    private Object obj;//处理对象

    public AbstractRequest(Object obj) {
        this.obj = obj;
    }

    //获取处理的内容对象
    public Object getContent(){
        return obj;
    }

    //获取请求者对象的处理级别
    public abstract int getRequestLevel();
}
