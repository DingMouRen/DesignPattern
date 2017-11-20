package design18_解释器模式.concreteExpression;

import design18_解释器模式.abstractExpression.ArithmetExpression;

//具体解释器：数字解释器-》目的是为了解释数字
public class NumExpression extends ArithmetExpression {
   private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;

    }
}
