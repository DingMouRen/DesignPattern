package design1_策略模式.impl_stragety;

import design1_策略模式.interface_stragety.Stragety;
//具体策略的实现：相加
public class StragetyAdd implements Stragety {
    /**
     * 具体算法的实现：通过相加的方式获取到数字6
     * @return
     */
    @Override
    public int calculate() {
        int result = 0;
        for (int i = 0; i < 6; i++) {
            result += 1;
        }
        return result;
    }
}
