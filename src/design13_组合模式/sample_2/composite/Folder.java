package design13_组合模式.sample_2.composite;

import design13_组合模式.sample_2.component.Dir;
import design13_组合模式.sample_2.leaf.File;

import java.util.Iterator;
import java.util.List;
//具体实现类，表示文件夹类，但是结构与子节点是一样的,
public class Folder extends Dir {

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void removeDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public void showStructure(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(getName());
        Iterator<Dir> iterator = dirs.iterator();
        while (iterator.hasNext()){
            iterator.next().showStructure(level + 3);
        }
    }

    @Override
    public List<Dir> getDirs() {
        return dirs;
    }
}
