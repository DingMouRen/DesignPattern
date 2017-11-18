package design1_策略模式.impl_stragety;

import design1_策略模式.interface_stragety.Stragety;

//具体策略的实现：相乘的
public class StargetyMultiply implements Stragety{
    /**
     * 具体算法的实现：通过相乘的方式获取到数字6
     * @return
     */
    @Override
    public int calculate() {
        int result = 2 * 3;
        return result;
    }
}
