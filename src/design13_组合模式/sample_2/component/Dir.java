package design13_组合模式.sample_2.component;

import java.util.ArrayList;
import java.util.List;

//抽象根节点表示文件夹和文件的抽象类
public abstract class Dir {
    //存储文件夹下所有的元素
    protected List<Dir> dirs = new ArrayList<>();
    //当前文件夹或者文件的名称
    private String name;

    public Dir(String name) {
        this.name = name;
    }

    //添加一个文件或者文件夹
    public abstract void addDir(Dir dir);
    //移除一个文件或者文件夹
    public abstract void removeDir(Dir dir);
    //清空文件夹下所有的元素
    public abstract void clear();
    //输出文件夹目录结构
    public abstract void showStructure();
    //获取文件夹下所有的文件或者子文件夹
    public abstract List<Dir> getDirs();
    //获取文件或文件夹名称

    public String getName() {
        return name;
    }
}
