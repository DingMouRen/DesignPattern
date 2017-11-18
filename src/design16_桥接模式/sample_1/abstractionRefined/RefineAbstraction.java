package design16_桥接模式.sample_1.abstractionRefined;

import design16_桥接模式.sample_1.abstraction.Abstraction;
import design16_桥接模式.sample_1.implementor.Implementor;
//抽象部分的子类
public class RefineAbstraction extends Abstraction {
    public RefineAbstraction(Implementor implementor) {
        super(implementor);
    }
    //对父类抽象部分中的方法进行扩展
    public void refineOperation(){
    }


}
