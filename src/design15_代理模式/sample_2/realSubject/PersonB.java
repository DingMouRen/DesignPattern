package design15_代理模式.sample_2.realSubject;

import design15_代理模式.sample_2.subject.ILawsuit;

//被代理类
public class PersonB  implements ILawsuit{
    @Override
    public void submit() {
        System.out.println(getClass().getSimpleName()+"提交仲裁申请");
    }

    @Override
    public void burden() {
        System.out.println(getClass().getSimpleName()+"进行举证");
    }

    @Override
    public void defend() {
        System.out.println(getClass().getSimpleName()+"进行辩护");
    }

    @Override
    public void finish() {
        System.out.println(getClass().getSimpleName()+"诉讼成功");
    }
}
