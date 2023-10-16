源码是通过IntelliJ IDEA编写的

[策略模式](http://www.jianshu.com/p/e632ba5c9eda)|[构建者模式](http://www.jianshu.com/p/8816165edbcd)|[观察者模式](http://www.jianshu.com/p/80ea597ccddb)|[装饰者模式](http://www.jianshu.com/p/7a9fae991ed4)|[工厂方法模式](http://www.jianshu.com/p/650ef554147a)|[抽象工厂模式](http://www.jianshu.com/p/446eddb7fe98)
---|---|---|---|---|---
[**单例模式**](http://www.jianshu.com/p/961084474634)|[**命令模式**](http://www.jianshu.com/p/c4d8a169a157)|[**适配器模式**](http://www.jianshu.com/p/b058131f694d)|[**外观模式**](http://www.jianshu.com/p/19c2d407223b)|[**模板方法模式**](http://www.jianshu.com/p/4ead50bbc6f1)|[**迭代器模式**](http://www.jianshu.com/p/5bcae636ae45)
[**组合模式**](http://www.jianshu.com/p/8d775fe8de1f)|[**状态模式**](http://www.jianshu.com/p/76b23fa84a95)|[**代理模式**](http://www.jianshu.com/p/bd76dc728edb)|[**桥接模式**](http://www.jianshu.com/p/999af930d7e8)|[**责任链模式**](http://www.jianshu.com/p/cd1158eff274)|[**解释器模式**](http://www.jianshu.com/p/3acba11b173c)
[**中介者模式**](http://www.jianshu.com/p/9f46356af027)|[**备忘录模式**](http://www.jianshu.com/p/adcdfb6af6d1)|[**原型模式**](http://www.jianshu.com/p/ffa8271ed481)|[**访问者模式**](http://www.jianshu.com/p/e985115c182b)|[**享元模式**](http://www.jianshu.com/p/5c3c288f3381)

设计模式是一套被反复使用、多数人知晓、经过分类的代码设计经验的总结。笔者也是经常使用一些常用的设计模式，比如构建者模式、代理模式等等。最近有时间又翻看了一遍，将java23种设计模式的回顾笔记写下来，以便用到时快速的查阅。关于源码，放在github上。<br>
### 面向对象的六大原则
###### ❀单一职责原则
就一个类而言，这个类应该是一组相关性很高的函数、数据的封装。（职责划分主要凭个人经验）
###### ❀开闭原则
软件中的对象（类、模块、函数等）应该对扩展开放，对于修改是封闭的。（现实开发中，尽量通过扩展方式实现变化，修改很容易引入错误）
###### ❀里氏替换原则
所有引用基类（父类、抽象类、接口）的地方必须能透明的使用其子类的对象。（继承、多态两大特性，父类所在的位置可以使用子类对象，相同类型的子类之间使用就不用修改代码咯）
###### ❀依赖倒置原则
模块间的依赖是通过抽象产生的，实现类之间不发生直接的依赖关系，其依赖关系通过接口或者抽象类产生。（面向抽象编程  面向接口编程）
###### ❀接口隔离原则
类间的依赖关系应该建立在最小的接口上。将庞大的接口拆分成更小的和更具体的接口，耦合性更低，容易重构、更改、重新部署。
###### ❀迪米特原则
一个类应该对自己需要耦合或调用的类知道的最少，类的内部如何实现与调用者或者依赖者没有关系，调用者或者依赖者只需要知道它需要的方法即可。（解耦合，降低类之间的耦合度）。<br>



