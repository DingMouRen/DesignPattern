package design13_组合模式.sample_2.leaf;

import design13_组合模式.sample_2.component.Dir;

import java.util.List;

//表示文件类，跟文件夹是相同的结构
public class File extends Dir{
    public File(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        throw new UnsupportedOperationException("文件不支持该操作");
    }

    @Override
    public void removeDir(Dir dir) {
        throw new UnsupportedOperationException("文件不支持该操作");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("文件不支持该操作");
    }

    @Override
    public void showStructure(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
    }

    @Override
    public List<Dir> getDirs() {
        throw new UnsupportedOperationException("文件不支持该操作");
    }
}
