# design_patterns
design_patterns

## 设计模式的类型：
> 总共有 23 种设计模式。这些模式可以分为三大类：创建型模式（Creational Patterns）、结构型模式（Structural Patterns）、
行为型模式（Behavioral Patterns）

- 创建型模式
    - 工厂模式（Factory Pattern）
    - 抽象工厂模式（Abstruct Factory Pattern）
    - 单例模式（Singleton Pattern）
    - 建造者模式（Builder Pattern）
    - 原型模式（Prototype Pattern）
- 结构型模式
    - 适配器模式（Adapter Pattern）
    - 桥接模式（Bridge Pattern）
    - 过滤器模式（Filter、Criteria Pattern）
    - 组合模式（Composite Pattern）
    - 装饰器模式（Decorator Pattern）
    - 外观模式（Facade Pattern）
    - 享元模式（Flyweight Pattern）
    - 代理模式（Proxy Pattern）
- 行为型模式
    - 责任连模式（Chain of Responsibility Pattern）
    - 命令模式（Command Pattern）
    - 解释器模式（Interpreter Pattern）
    - 迭代器模式（Iterator Pattern）
    - 中介者模式（Mediator Pattern）
    - 备忘录模式（Memento Pattern）
    - 观察者模式（Observer Pattern）
    - 状态模式（State Pattern）
    - 空对象模式（Null Object Pattern）
    - 策略模式（Strategy Pattern）
    - 模板模式（Template Pattern）
    - 访问者模式（Visitor Pattern）
- J2EE模式
    - MVC模式（MVC Pattern）
    - 业务代表模式（Business Delegate Pattern）
    - 组合实体模式（Composite Entity Pattern）
    - 数据访问对象模式（Data Access Object Pattern）
    - 前端控制器模式（Front Controller Pattern）
    - 拦截过滤器模式（Intercepting Filter Pattern）
    - 服务定位器模式（Service Locator Pattern）
    - 传输对象模式（Transfer Object Pattern）
    
## 设计模式关系图：
![设计模式关系图](/src/main/resources/images/设计模式关系图.jpg)

## 设计模式的六大原则：
1.开闭原则（Open Close Principle）
> 开闭原则的意思是：**对扩展开放，对修改关闭。** 在程序需要进行拓展的时候，不能去修改原有的代码，实现一个热插拔的效果。
简言之，是为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类。

2.里氏代换原则（Liskov Subsititution Principle）
> 里氏替换原则是面向对象设计的基本原则之一。里氏代换原则中说，任何基类可以出现的地方，字类一定可以出现。LSP是继承复用的
基石，只有当派生类可以替换掉基类，且软件单位的功能不受到影响时，基类才能真正被复用，而派生类也能够在基类的基础上增加新的
行为。里氏代换原则是堆开闭原则的补充。实现开闭原则的关键步骤就是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以
里氏代换原则是堆实现抽象化的具体步骤的规范。

3.依赖倒转原则（Dependence Inversion Principle）
> 这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体

4.接口隔离原则（Interface Segregation Principle）
> 这个原则的意思是：使用多个隔离的接口，比使用单个接口要好。它还有另一个意思是：降低类之间的耦合度。由此可见，其实设计模
式就是从大型软件架构出发、便于升级和维护的软件设计思想，它强调降低依赖，降低耦合。

5.迪米特法则，又称最少知道原则（Demeter Principle）
> 最少知道原则是指：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。

6.合成复用原则（Composite Reuse Principle）
> 合成复用原则是指：尽量使用合成/聚合地方式，而不是使用继承。

### 工厂模式：
> 工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
  在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
#### 介绍
 - **意图：** 定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 - **主要解决：** 主要解决接口选择的问题。
 - **何时使用：** 当我们明确地计划不同条件下创建不同实例时。
 - **如何解决：** 让其字类实现工厂接口，返回的也是一个抽象的产品。
 - **关键代码：** 创建过程在其字类执行。
 - **应用实例：** 1、您需要一辆汽车，可以直接从工厂里面提货，而不用去管这辆汽车是怎么做出来的，以及这个汽车里面的具体实现。 
 2、Hibernate 换数据库只需换方言和驱动就可以。
 - **优点：** 1、一个调用者想创建一个对象，只要知道其名称就可以了。 
 2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 
 3、屏蔽产品的具体实现，调用者只关心产品的接口。
 - **缺点：** 每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系
 统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
 - **使用场景：** 1、日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等，用户可以选择记录日志到什么地方。 
 2、数据库访问，当用户不知道最后系统采用哪一类数据库，以及数据库可能有变化时。 
 3、设计一个连接服务器的框架，需要三个协议，"POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
 - **注意事项：** 作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复
 杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需
 要引入一个工厂类，会增加系统的复杂度。
 
 #### 实现
 > 创建一个 Shape 接口和实现 Shape 接口的实体类。下一步是定义工厂类 ShapeFactory。
FactoryPatternDemo演示类使用ShapeFactory来获取Shape对象。它将向 ShapeFactory 传递信息（CIRCLE / RECTANGLE / SQUARE），
以便获取它所需对象的类型。
![工厂模式实例](/src/main/resources/images/工厂模式实例.jpg)