package design17_责任链模式.sample_2.abstractHandler;
//抽象处理者：领导们╮(╯▽╰)╭
public abstract class Leader {
    public Leader nextLeader;//上一任领导，对应下一个处理者对象

    /**
     * 处理报账
     * @param money 请求报账的额度
     */
    public final void handleRequest(int money){
        if (money <= limit()){
            handle(money);
        }else {
            if (null != nextLeader) nextLeader.handleRequest(money);
        }
    }

    /**
     * 自身能够批复的最大额度
     * @return 返回额度
     */
    public abstract int limit();

    /**
     * 处理报账的具体行为
     * @param money
     */
    public abstract void handle(int money);
}
