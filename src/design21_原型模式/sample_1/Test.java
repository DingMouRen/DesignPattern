package design21_原型模式.sample_1;

public class Test {
    public static void main(String[] args) {
        //构建文档对象
        WordDocument originDoc = new WordDocument();
        //编辑文档，添加图片
        originDoc.setText("文本1");
        originDoc.addImage("图片1");
        originDoc.addImage("图片2");
        originDoc.addImage("图片3");
        originDoc.addImage("图片4");
        //以原型文档为原型，拷贝一份副本
        WordDocument doc2 = (WordDocument) originDoc.clone();
        doc2.showDocument();
        //修改文档副本，不会影响原始文档
        doc2.setText("我修改了文本呢");
        doc2.addImage("新图片");
        doc2.showDocument();

        //原型文档
        originDoc.showDocument();

    }
}
