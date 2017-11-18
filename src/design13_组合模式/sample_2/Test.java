package design13_组合模式.sample_2;

import design13_组合模式.sample_2.component.Dir;
import design13_组合模式.sample_2.composite.Folder;
import design13_组合模式.sample_2.leaf.File;

public class Test {
    public static void main(String[] args) {
        //构造一个根目录对象C
        Dir diskC = new Folder("C盘");
        //根目录C下添加一个mp3文件
        diskC.addDir(new File("NeedYouNow.mp3"));
        //根目录C下添加三个子目录windows user programfile
        Dir windows = new Folder("windows");
        diskC.addDir(windows);
        Dir user =  new Folder("user");
        diskC.addDir(user);
        Dir programfile = new Folder("programfile");
        diskC.addDir(programfile);
        //windows目录下添加qq.exe文件，user目录下添加info.txt文件，programfile目录下添加触不可及（法国版）.mp4
        windows.addDir(new File("qq.exe"));
        windows.addDir(new File("weixin.exe"));
        user.addDir(new File("info.txt"));
        user.addDir(new File("data.txt"));
        programfile.addDir(new File("触不可及（法国版）.mp4"));
        programfile.addDir(new File("战狼2.mp4"));
        //打印出根目录结构
        diskC.showStructure(0);
    }
}
