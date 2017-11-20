package design18_解释器模式;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("1 + 1 + 1 - 2");
        System.out.println(calculator.calulate()+"");
    }
}
