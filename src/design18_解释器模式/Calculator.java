package design18_解释器模式;

import design18_解释器模式.abstractExpression.ArithmetExpression;
import design18_解释器模式.concreteExpression.AdditionExpression;
import design18_解释器模式.concreteExpression.NumExpression;
import design18_解释器模式.concreteExpression.SubtractionExpression;

import java.util.Stack;

//处理解释器相关的业务
public class Calculator {
    //声明一个Stack栈存储并操作所有相关的解释器
    private Stack<ArithmetExpression> stack = new Stack<>();

    public Calculator(String expression){
        //声明两个ArithmeticExpression类型的临时变量，存储运算符左右两边的数字解释器
        ArithmetExpression expression1,expression2;
        //将字符串分割
        String[] elements = expression.split(" ");
        //循环遍历元素数组
        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)){
                case '+':
                    expression1 = stack.pop();
                    expression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    stack.push(new AdditionExpression(expression1,expression2));
                    break;
                case '-':
                    expression1 = stack.pop();
                    expression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    stack.push(new SubtractionExpression(expression1,expression2));
                    break;
                default:
                    stack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;

            }
        }

    }

    public int calulate(){
        return stack.pop().interpret();
    }
}
