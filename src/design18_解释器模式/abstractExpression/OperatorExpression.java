package design18_解释器模式.abstractExpression;
//抽象解释器：运算符号的抽象解释器
public class OperatorExpression extends ArithmetExpression {
    //声明两个成员变量并存储运算符号两边的数字解释器
   protected ArithmetExpression expression1,expression2;

    public OperatorExpression(ArithmetExpression expression1, ArithmetExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int interpret() {
        return 0;
    }
}
