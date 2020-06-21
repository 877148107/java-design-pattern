- # 基本介绍

  1) 迭代器模式（Iterator Pattern）是常用的设计模式，属于行为型模式

  2) 如果我们的**集合元素是用不同的方式实现**的，有数组，还有java的集合类，或者还有其他方式，当客户端要**遍历这些集合元素**的时候就要使用多种遍历方式，而且还会暴露元素的内部结构，可以考虑使用迭代器模式解决。

  3) 迭代器模式，提供一种遍历集合元素的统一接口，用一致的方法遍历集合元素，不需要知道集合对象的底层表示，即：不暴露其内部的结构。

- # 基本原理

  Iterator：迭代器接口，是JDK提供的，含有hasNext、next、remove

  ConcreteIterator：具体的迭代器类，管理迭代
  
  Aggregate：一个统一的聚合接口，将客户端和具体聚合解耦
  
  ConcreteAggregate：具体的聚合持有对象集合，并提供一个方法返回一个迭代器，该迭代器可以遍历集合
  
  ![image-20200611220524050](E:\workplace\java-design-pattern\design-pattern-iterator\docs\image-20200611220524050.png)

- # 应用案例

  ## 1、需求

  编写程序展示一个学校院系结构：需求是这样，要在一个页面中展示出学校的院系组成，一个学校有多个学院，一个学院有多个系。

  ## 2、UML类图

  ![image-20200616231308645](E:\workplace\java-design-pattern\design-pattern-iterator\docs\image-20200616231308645.png)

  ## 3、代码实现

  学院及院系的迭代器

  ```java
  public class ComputerCollegeIterator implements Iterator {
  
      List<Department> departments;
      int position = -1;
  
      public ComputerCollegeIterator(List<Department> departments) {
          this.departments = departments;
      }
  
      @Override
      public boolean hasNext() {
          if(position >= departments.size() -1){
              return false;
          }
          position += 1;
          return true;
      }
  
      @Override
      public Object next() {
          Department department = departments.get(position);
          return department;
      }
  
      @Override
      public void remove() {
  
      }
  }
  ```

  ```java
  public class InfoCollegeIterator implements Iterator {
  
      /**
       * 存放院系
       */
      Department[] departments;
      /**
       * 遍历位置
       */
      int position = 0;
  
      public InfoCollegeIterator(Department[] departments) {
          this.departments = departments;
      }
  
      @Override
      public boolean hasNext() {
          if( position > departments.length || departments[position] == null){
              return false;
          }
          return true;
      }
  
      @Override
      public Object next() {
          Department department = departments[position];
          position += 1;
          return department;
      }
  
      @Override
      public void remove() {
  
      }
  }
  ```

  学院、院系实体

  ```java
  public interface College {
  
      String getName();
  
      void addDepartment(String name,String desc);
  
      Iterator createIterator();
  }
  ```

  ```java
  public class ComputerCollege implements College {
  
      List<Department> departments;
  
  
      public ComputerCollege() {
          departments = new ArrayList<>();
          addDepartment("Java","Java专业");
          addDepartment("PHP","PHP专业");
          addDepartment("Python","Python专业");
      }
  
      @Override
      public String getName() {
          return "计算机学院";
      }
  
      @Override
      public void addDepartment(String name, String desc) {
          Department department = new Department(name,desc);
          departments.add(department);
      }
  
      @Override
      public Iterator createIterator() {
          return new ComputerCollegeIterator(departments);
      }
  }
  ```

  ```java
  public class InfoCollege implements College {
  
      Department[] departments;
      int positon = 0;
  
      public InfoCollege() {
          departments = new Department[5];
          addDepartment("信息工程","信息工程学院");
          addDepartment("信息安全","信息安全学院");
          addDepartment("通信工程","通信工程学院");
      }
  
      @Override
      public String getName() {
          return "信息工程学院";
      }
  
      @Override
      public void addDepartment(String name, String desc) {
          Department department = new Department(name,desc);
          departments[positon] = department;
          positon++;
      }
  
      @Override
      public Iterator createIterator() {
          return new InfoCollegeIterator(departments);
      }
  }
  ```

  ```java
  public class Department {
  
      private String name;
  
      private String desc;
  
      public Department(String name, String desc) {
          this.name = name;
          this.desc = desc;
      }
  
      public String getName() {
          return name;
      }
  
      public void setName(String name) {
          this.name = name;
      }
  
      public String getDesc() {
          return desc;
      }
  
      public void setDesc(String desc) {
          this.desc = desc;
      }
  }
  ```

  学院及院系输出

  ```java
  public class OutputImpl {
  
      List<College> collegeList;
  
      public OutputImpl(List<College> collegeList) {
          this.collegeList = collegeList;
      }
  
      /**
       * 打印学院
       */
      public void printCollege(){
          Iterator<College> iterator = collegeList.iterator();
          while (iterator.hasNext()){
              College college = iterator.next();
              System.out.println("=================="+college.getName()+"=================");
              printDepartment(college.createIterator());
          }
      }
  
      /**
       * 打印院系
       * @param iterator
       */
      public void printDepartment(Iterator iterator){
          while (iterator.hasNext()){
              Department department = (Department) iterator.next();
              System.out.println(department.getName());
          }
      }
  }
  ```

  测试类

  ```java
  public class IteratorClient {
  
      public static void main(String[] args) {
  
          List<College> collegeList = new ArrayList<>();
  
          ComputerCollege computerCollege = new ComputerCollege();
          InfoCollege infoCollege = new InfoCollege();
  
          collegeList.add(computerCollege);
          collegeList.add(infoCollege);
  
          OutputImpl output = new OutputImpl(collegeList);
          output.printCollege();
      }
  }
  ```

  ![image-20200621230823849](E:\workplace\java-design-pattern\design-pattern-iterator\docs\image-20200621230823849.png)

- # 源码分析

  JDK的ArrayList集合就使用了迭代器模式

  1）ArrayList的内部类Itr充当了具体的迭代器

  2）List充当了聚合接口，含有iterator方法返回一个迭代器对象

  3）ArrayList是实现了List的子类，实现了iterator方法

  4）Iterator接口系统jdk提供

  5）不同的集合都提供了不同的迭代器来解决统一遍历问题

![image-20200621232200734](E:\workplace\java-design-pattern\design-pattern-iterator\docs\image-20200621232200734.png)

- # 总结

   **优点**

  1) 提供一个统一的方法遍历对象，客户不用再考虑聚合的类型，使用一种方法就可以遍历对象了。

  2) 隐藏了聚合的内部结构，客户端要遍历聚合的时候只能取到迭代器，而不会知道聚合的具体组成。

  3) 提供了一种设计思想，就是一个类应该只有一个引起变化的原因（叫做**单一责任原则**）。在聚合类中，我们把迭代器分开，就是要把管理对象集合和遍历对象集合的责任分开，这样一来集合改变的话，只影响到聚合对象。而如果遍历方式改变的话，只影响到了迭代器。

  4) 当要展示一组相似对象，或者遍历一组相同对象时使用, 适合使用迭代器模式

   **缺点**

  1）每个聚合对象都要一个迭代器，会生成多个迭代器不好管理类