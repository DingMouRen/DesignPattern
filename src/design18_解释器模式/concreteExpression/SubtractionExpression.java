package design18_解释器模式.concreteExpression;

import design18_解释器模式.abstractExpression.ArithmetExpression;
import design18_解释器模式.abstractExpression.OperatorExpression;
//具体解释者：减法解释者
public class SubtractionExpression extends OperatorExpression {
    public SubtractionExpression(ArithmetExpression expression1, ArithmetExpression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpret() {
        return expression1.interpret() - expression2.interpret();
    }
}
