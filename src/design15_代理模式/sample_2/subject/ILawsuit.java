package design15_代理模式.sample_2.subject;
//主题抽象接口：诉讼流程
public interface ILawsuit {
    //提交申请
    void submit();
    //进行举证
    void burden();
    //开始辩护
    void defend();
    //诉讼完成
    void finish();
}
