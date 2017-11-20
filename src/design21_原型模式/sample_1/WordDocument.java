package design21_原型模式.sample_1;

import java.util.ArrayList;

//Cloneable代表Prototype，WordDocument代表ConcretePrototype
public class WordDocument implements Cloneable {
    //文本
    private String text;
    //图片列表
    private ArrayList<String> images = new ArrayList<>();

    @Override
    protected Object clone()  {
        try {
            WordDocument document = (WordDocument) super.clone();
            document.text = this.text;
            document.images = this.images;
            return document;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    //打印文档内容
    public void showDocument(){
        System.out.println("-------- 文档内容： --------");
        System.out.println("Text:"+text);
        System.out.print("Images:");
        for (String imgName : images){
            System.out.print(imgName+",");
        }
        System.out.println();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void addImage(String img) {
        this.images.add(img);
    }
}
