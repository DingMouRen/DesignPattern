package design14_状态模式.state;
//状态的抽象接口类：电视状态接口
public interface TvState {
    void nextChannel();
    void preChannel();
    void turnUp();
    void turnDown();
}
