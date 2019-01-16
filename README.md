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

### 抽象工厂模式：
> 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计
模式属于创建型模式，它提供了一种创建对象的最佳方式。
在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。

#### 介绍
- **意图：** 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
- **主要解决：** 主要解决接口选择的问题。
- **何时使用：** 系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
- **如何解决：** 在一个产品族里面，定义多个产品。
- **关键代码：** 在一个工厂里聚合多个同类产品。
- **应用实例：** 工作了，为了参加一些聚会，肯定有两套或多套衣服吧，比如说有商务装（成套，一系列具体产品）、
时尚装（成套，一系列具体产品），甚至对于一个家庭来说，可能有商务女装、商务男装、时尚女装、时尚男装，这些也都是成套的，
即一系列具体产品。假设一种情况（现实中是不存在的，要不然，没法进入共产主义了，但有利于说明抽象工厂模式），在您的家中，
某一个衣柜（具体工厂）只能存放某一种这样的衣服（成套，一系列具体产品），每次拿这种成套的衣服时也自然要从这个衣柜中取出了。
用 OO 的思想去理解，所有的衣柜（具体工厂）都是衣柜类的（抽象工厂）某一个，而每一件成套的衣服又包括具体的上衣（某一具体产品），
裤子（某一具体产品），这些具体的上衣其实也都是上衣（抽象产品），具体的裤子也都是裤子（另一个抽象产品）。
- **优点：** 当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
- **缺点：** 产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
- **使用场景：** 1、QQ换皮肤，一整套一起换。 
2、生成不同操作系统的程序。
- **注意事项：** 产品族难扩展，产品等级易扩展。

#### 实现
> 创建 Shape 和 Color 接口和实现这些接口的实体类。下一步是创建抽象工厂类 AbstractFactory。接着定义工厂类ShapeFactory和
ColorFactory，这两个工厂类都是扩展了AbstractFactory。然后创建一个工厂创造器/生成器类FactoryProducer。
AbstractFactoryPatternDemo演示类使用FactoryProducer来获取AbstractFactory对象。它将向AbstractFactory传递形状信息
Shape（CIRCLE / RECTANGLE / SQUARE），以便获取它所需对象的类型。同时它还向AbstractFactory传递颜色信息
Color（RED / GREEN / BLUE），以便获取它所需对象的类型。
![抽象工厂模式实例](/src/main/resources/images/抽象工厂模式实例.jpg)

### 单例模式：
> 单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的
最佳方式。
这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，
可以直接访问，不需要实例化该类的对象。
**注意：**
1.单例类只能有一个实例。
2.单例类必须自己创建自己的唯一实例。
3.单例类必须给所有其他对象提供这一实例。

#### 介绍
- **意图：** 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
- **主要解决：** 一个全局使用的类频繁地创建与销毁。
- **何时使用：** 当您想控制实例数目，节省系统资源的时候。
- **如何解决：** 判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
- **关键代码：** 构造函数是私有的。
- **应用实例：** 1、一个党只能有一个书记。 
2、Windows是多进程多线程的，在操作一个文件的时候，就不可避免地出现多个进程或线程同时操作一个文件的现象，所以所有文件的
处理必须通过唯一的实例来进行。
3、一些设备管理器常常设计为单例模式，比如一个电脑有两台打印机，在输出的时候就要处理不能两台打印机打印同一个文件。
- **优点：** 1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。 
2、避免对资源的多重占用（比如写文件操作）。
- **缺点：** 没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
- **使用场景：** 1、要求生产唯一序列号。
2、WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。
3、创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。
- **注意事项：** getInstance()方法中需要使用同步锁synchronized(Singleton.class)防止多线程同时进入造成instance被多次实例化。

#### 实现
> 创建一个SingleObject类。SingleObject类有它的私有构造函数和本身的一个静态实例。
SingleObject类提供了一个静态方法，供外界获取它的静态实例。SingletonPatternDemo演示类使用SingleObject类来获取SingleObject对象。
![单例模式关系图](/src/main/resources/images/单例模式实例.jpg)

#### 单例模式的几种实现方式
1. **懒汉式，线程不安全**
    - **是否Lazy初始化：** 是
    - **是否多线程安全：** 否
    - **实现难度：** 易
    - **描述：** 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁synchronized，所以严格意义
    上它并不算单例模式。这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
    ```
    public class Singleton {
        private static Singleton instance;
        private Singleton() {}
        
        public static Singleton getInstance() {
            if (null == instance) {
                instance = new Singleton();
            }
            return instance;
        }
    }
    ```
    
    **接下来介绍的几种实现方式都支持多线程，但是在性能上有所差异。**

2. **懒汉式，线程安全**
    - **是否Lazy初始化：** 是
    - **是否多线程安全：** 是
    - **实现难度：** 易
    - **描述：** 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
        - 优点：第一次调用才初始化，避免内存浪费。
        - 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
        getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。 
    ```
    public class Singleton {
        private static Singleton instance;
        private Singleton() {}
        
        public static synchronized Singleton getInstance() {
            if (null == instance) {
                instance = new Singleton();
            }
            return instance;
        }
    }
    ```
    
3. **饿汉式**
    - **是否Lazy初始化：** 否
    - **是否多线程安全：** 是
    - **实现难度：** 易
    - **描述：** 这种方式比较常用，但容易产生垃圾对象。
        - 优点：没有加锁，执行效率会提高。
        - 缺点：类加载时就初始化，浪费内存。
        它基于 classloader 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，
        在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候
        初始化 instance 显然没有达到 lazy loading 的效果。
    ```
    public class Singleton {
        private static Singleton instance = new Singleton();
        private Singleton() {}
        
        public static Singleton getInstance() {
            return instance;
        }
    }
    ```
        
4. **双检锁/双重校验锁（DCL，即 double-checked locking）**
    - **JDK版本：** JDK1.5 起
    - **是否Lazy初始化：** 是
    - **是否多线程安全：** 是
    - **实现难度：** 较复杂
    - **描述：** 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
    getInstance() 的性能对应用程序很关键。
    ```
    public class Singleton {
        private volatile static Singleton instance;
        private Singleton() {}
        
        public static Singleton getInstance() {
            if (null == instance) {
                synchronized(Singleton.class) {
                    if (null == instance) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        } 
    }
    ```
    
5. **登记式/静态内部类**
    - **是否Lazy初始化：** 是
    - **是否多线程安全：** 是
    - **实现难度：** 一般
    - **描述：** 这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
    这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
    这种方式同样利用了 classloader 机制来保证初始化 instance 时只有一个线程，它跟第 3 种方式不同的是：第 3 种方式只要 
    Singleton 类被装载了，那么 instance 就会被实例化（没有达到 lazy loading 效果），而这种方式是 Singleton 类被装载了，
    instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 
    SingletonHolder 类，从而实例化 instance。想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，另外一方面，
    又不希望在 Singleton 类加载时就实例化，因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，那么这个时候
    实例化 instance 显然是不合适的。这个时候，这种方式相比第 3 种方式就显得很合理。
    ```
    public class Singleton {
        private static class SingletonHolder {
            private static final Singleton INSTANCE = new Singleton();
        }
        private Singleton() {}
        public static final Singleton getInstence() {
            return SingletonHolder.INSTANCE;
        }
    }
    ```
    
6. **枚举**
    - **JDK版本：** JDK1.5 起
    - **是否Lazy初始化：** 否
    - **是否多线程安全：** 是
    - **实现难度：** 易
    - **描述：** 这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
    这种方式是Effective Java作者Josh Bloch提倡的方式，它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化
    重新创建新的对象，绝对防止多次实例化。不过，由于JDK1.5之后才加入enum特性，用这种方式写不免让人感觉生疏，在实际工作中，
    也很少用。不能通过 reflection attack 来调用私有构造方法。
    ```
    public enum Singleton {
        INSTANCE;
        public void whateverMethod() {}
    }
    ```

> **经验之谈：** 一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。只有在要明确实现 lazy loading 
效果时，才会使用第 5 种登记方式。如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考
虑使用第 4 种双检锁方式。