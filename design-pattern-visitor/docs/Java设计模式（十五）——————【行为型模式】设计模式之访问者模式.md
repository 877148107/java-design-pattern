- # 基本介绍

  **1)** **访问者模式（Visitor Pattern）**，封装一些作用于某种数据结构的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。

  2) 主要将数据结构与数据操作分离，解决 **数据结构**和**操作耦合性**问题

  **3)** **访问者模式的基本工作原理是：**在被访问的类里面加一个对外提供接待访问者的接口

  **4)** **访问者模式主要应用场景是：**需要对一个对象结构中的对象进行很多不同操作(这些操作彼此没有关联)，同时需要避免让这些操作"污染"这些对象的类，可以选用访问者模式解决

- # 基本原理

  原理图如下：

  ![image-20200602224443385](E:\workplace\java-design-pattern\design-pattern-visitor\docs\image-20200602224443385.png)

  1、Visitor：抽象的访问者，为该对象结构中的ConcreteElement的每一个类声明一个visit操作

  2、ConcreteVisitor：一个具体的访问者，实现每个有Visitor 声明的操作，是每个操作实现的部分

  3、ObjectStructure：能枚举它的元素，可以提供一个高层的接口，用来允许访问者访问元素

  4、Element：抽象元素，定义一个能接收访问者对象的抽象方法（accept）

  5、ConcreteElement：具体的元素，实现了能接收访问者对象的抽象方法（accept）

- # 应用案例

  ## 1、需求

  将人分为男人和女人，对歌手进行测评，当看完某个歌手表演后，得到他们对该歌手不同的评价(评价 有不同的种类，比如 成功、失败 等)。

  ## 2、UML类图

  ![image-20200602230016226](E:\workplace\java-design-pattern\design-pattern-visitor\docs\image-20200602230016226.png)

  ## 3、代码实现

  ```java
  //抽象的访问者
  public abstract class Action {
  
      public abstract void getManResult(Man man);
  
      public abstract void getWomanResult(Woman woman);
  }
  
  //具体的访问者
  public class Success extends Action {
      @Override
      public void getManResult(Man man) {
          System.out.println("男人给的测评是成功。。。。。。。。");
      }
  
      @Override
      public void getWomanResult(Woman woman) {
          System.out.println("女人给的测评是成功。。。。。。。。");
      }
  }
  
  //具体的访问者
  public class Fail extends Action {
      @Override
      public void getManResult(Man man) {
          System.out.println("男人给的测评是失败。。。。。。。。");
      }
  
      @Override
      public void getWomanResult(Woman woman) {
          System.out.println("女人给的测评是失败。。。。。。。。");
      }
  }
  ```

  ```java
  //接收访问者的抽象元素
  public abstract class Person {
  
      public abstract void accept(Action action);
  }
  
  //具体的元素
  public class Woman extends Person {
      @Override
      public void accept(Action action) {
          action.getWomanResult(this);
      }
  }
  
  //具体的元素
  public class Man extends Person {
      @Override
      public void accept(Action action) {
          action.getManResult(this);
      }
  }
  ```

  ```java
  //访问者的数据结构，用来允许访问者访问元素
  public class ObjectStructure {
  
      /**
       * 维护一个集合
       */
      List<Person> elements = new LinkedList<>();
  
      /**
       * 新增
       * @param person
       */
      public void attach(Person person){
          elements.add(person);
      }
  
      public void detach(Person person){
          elements.remove(person);
      }
  
      /**
       * 显示测评
       * @param action
       */
      public void display(Action action){
          for (Person person : elements) {
              person.accept(action);
          }
      }
  
  }
  ```

  测试：

  ```java
  public class Client {
  
      public static void main(String[] args) {
          ObjectStructure objectStructure = new ObjectStructure();
          objectStructure.attach(new Man());
          objectStructure.attach(new Woman());
  
          System.out.println("==============success=================");
          Success success = new Success();
          objectStructure.display(success);
          System.out.println("===============fail================");
          Fail fail = new Fail();
          objectStructure.display(fail);
      }
  }
  ```

  ==============success=================
  男人给的测评是成功。。。。。。。。
  女人给的测评是成功。。。。。。。。
  ===============fail================
  男人给的测评是失败。。。。。。。。
  女人给的测评是失败。。。。。。。。

- # 总结

  上面的应用案例中用到了双分派，所谓双分派是指不管类怎么变化，我们都能找到期望的方法运行。双分派意味着得到执行的操作取决于请求的种类和两个接收者的类型。访问者里面用到了元素，元素里面也用到了访问者。

  **优点**

  1) 访问者模式符合单一职责原则、让程序具有优秀的扩展性、灵活性非常高

  2) 访问者模式可以对功能进行统一，可以做报表、UI、拦截器与过滤器，适用于数据结构相对稳定的系统 

  **缺点**

  1) 具体元素对访问者公布细节，也就是说访问者关注了其他类的内部细节，这是迪米特法则所不建议的, 这样造成了具体元素变更比较困难

  2) 违背了依赖倒转原则。访问者依赖的是具体元素，而不是抽象元素（**案例中抽象访问者依赖了具体的元素**）

  3) 因此，如果一个系统有比较稳定的数据结构，又有经常变化的功能需求，那么访问者模式就是比较合适的