- # 基本介绍

  ​		观察者模式（有时又被称为模型（Model）-视图（View）模式、源-收听者(Listener)模式或从属者模式）是[软件设计模式](https://baike.baidu.com/item/软件设计模式/2117635)的一种。在此种模式中，一个目标物件管理所有相依于它的观察者物件，并且在它本身的状态改变时主动发出通知。这通常透过呼叫各观察者所提供的方法来实现。此种模式通常被用来实现事件处理系统。

  ​       **观察者模式（Observer）**，又叫**发布-订阅模式（Publish/Subscribe）**，定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新。类似现在流行的消息中间件RabbitMQ、ActiveMQ等等都使用观察者模式即消息的订阅与发布。

- # 基本原理

  1）Subject：管理观察者，实现对观察者的注册、移除、通知的管理。

  2）ConcreteSubject：具体的观察者管理实现类。观察者模式的核心类。

  3）Observer：观察者接口

  4）ConcreteObserver：具体的观察者，实现观察者接口。receive接收Subject的通知消息

![image-20200627114337214](E:\workplace\java-design-pattern\design-pattern-observer\docs\images\image-20200627114002240.png)

- # 应用案例

  ## 1、需求

  1) 气象站可以将每天测量到的温度，湿度，气压等等以公告的形式发布出去(比如发布到自己的网站或第三方)。

  2) 需要设计开放型API，便于其他第三方也能接入气象站获取数据。

  3) 提供温度、气压和湿度的接口

  4) 测量数据更新时，要能实时的通知给第三方

  ## 2、类图

  ![image-20200627114855745](E:\workplace\java-design-pattern\design-pattern-observer\docs\images\image-20200627114754202.png)

  ## 3、代码实现

  ```java
  public interface Observer {
  
      /**
       * 观察者接口接收天气的方法
       * @param temperature   温度
       * @param pressure  气压
       * @param humidity  湿度
       */
      void receive(float temperature,float pressure,float humidity);
  }
  ```

  ```java
  public class BaiduSite implements Observer {
  
      /**
       * 温度
       */
      private float temperature;
      /**
       * 气压
       */
      private float pressure;
      /**
       * 湿度
       */
      private float humidity;
  
      @Override
      public void receive(float temperature, float pressure, float humidity) {
          this.temperature = temperature;
          this.pressure = pressure;
          this.humidity = humidity;
          display();
      }
  
      public void display(){
          System.out.println("==================百度网站天气接收===================");
          System.out.println("温度："+temperature);
          System.out.println("气压："+pressure);
          System.out.println("湿度："+humidity);
      }
  }
  ```

  ```java
  public class SinaSite implements Observer {
  
      /**
       * 温度
       */
      private float temperature;
      /**
       * 气压
       */
      private float pressure;
      /**
       * 湿度
       */
      private float humidity;
  
      @Override
      public void receive(float temperature, float pressure, float humidity) {
          this.temperature = temperature;
          this.pressure = pressure;
          this.humidity = humidity;
          display();
      }
  
      public void display(){
          System.out.println("==================新浪网站天气接收===================");
          System.out.println("温度："+temperature);
          System.out.println("气压："+pressure);
          System.out.println("湿度："+humidity);
      }
  }
  ```

  ```java
  public interface Subject {
  
      /**
       * 注册观察者
       * @param observer
       */
      void registerObserver(Observer observer);
  
      /**
       * 移除观察者
       * @param observer
       */
      void removeObserver(Observer observer);
  
      /**
       * 通知所有观察者
       */
      void notifyObserver();
  }
  ```

  ```java
  public class WeatherData implements Subject {
  
      /**
       * 温度
       */
      private float temperature;
      /**
       * 气压
       */
      private float pressure;
      /**
       * 湿度
       */
      private float humidity;
  
      /**
       * 观察者集合
       */
      private List<Observer> observers;
  
      public WeatherData() {
          observers = new ArrayList<>();
      }
  
      public float getTemperature() {
          return temperature;
      }
  
      public void setTemperature(float temperature) {
          this.temperature = temperature;
      }
  
      public float getPressure() {
          return pressure;
      }
  
      public void setPressure(float pressure) {
          this.pressure = pressure;
      }
  
      public float getHumidity() {
          return humidity;
      }
  
      public void setHumidity(float humidity) {
          this.humidity = humidity;
      }
  
      public void dataChange(float temperature,float pressure,float humidity){
          this.temperature = temperature;
          this.pressure = pressure;
          this.humidity = humidity;
          notifyObserver();
      }
  
      @Override
      public void registerObserver(Observer observer) {
          if(!observers.contains(observer)){
              observers.add(observer);
          }
      }
  
      @Override
      public void removeObserver(Observer observer) {
          if(observers.contains(observer)){
              observers.remove(observer);
          }
      }
  
      @Override
      public void notifyObserver() {
          for (Observer observer : observers) {
              observer.receive(this.temperature,this.pressure,this.humidity);
          }
      }
  }
  ```

  测试

  ```java
  public class ObserverClient {
  
      public static void main(String[] args) {
          WeatherData weatherData = new WeatherData();
  
          BaiduSite baiduSite = new BaiduSite();
          SinaSite sinaSite = new SinaSite();
          //注册
          weatherData.registerObserver(baiduSite);
          weatherData.registerObserver(sinaSite);
          //天气数据
          weatherData.dataChange(20,100,60);
      }
  }
  ```

  ![image-20200627121348470](E:\workplace\java-design-pattern\design-pattern-observer\docs\images\image-20200627121348470.png)

- # 源码分析

  观察者模式在Jdk应用的源码分析

  **Jdk**的**java.util.Observable**类就使用了观察者模式

  1）Observable：相当于WeatherData，但是这个源码里面没有管理观察者的接口而是直接使用类去管理Observer

  2）Observer：相当于前面的Observer，通过update来通知观察者。

  ```java
  public class Observable {
      private boolean changed = false;
      private Vector<Observer> obs;
  
      /** Construct an Observable with zero Observers. */
  
      public Observable() {
          obs = new Vector<>();
      }
  
      /**
       * Adds an observer to the set of observers for this object, provided
       * that it is not the same as some observer already in the set.
       * The order in which notifications will be delivered to multiple
       * observers is not specified. See the class comment.
       *
       * @param   o   an observer to be added.
       * @throws NullPointerException   if the parameter o is null.
       */
      public synchronized void addObserver(Observer o) {
          if (o == null)
              throw new NullPointerException();
          if (!obs.contains(o)) {
              obs.addElement(o);
          }
      }
      ......
          public void notifyObservers(Object arg) {
          /*
               * a temporary array buffer, used as a snapshot of the state of
               * current Observers.
               */
          Object[] arrLocal;
  
          synchronized (this) {
              /* We don't want the Observer doing callbacks into
                   * arbitrary code while holding its own Monitor.
                   * The code where we extract each Observable from
                   * the Vector and store the state of the Observer
                   * needs synchronization, but notifying observers
                   * does not (should not).  The worst result of any
                   * potential race-condition here is that:
                   * 1) a newly-added Observer will miss a
                   *   notification in progress
                   * 2) a recently unregistered Observer will be
                   *   wrongly notified when it doesn't care
                   */
              if (!changed)
                  return;
              arrLocal = obs.toArray();
              clearChanged();
          }
  
          for (int i = arrLocal.length-1; i>=0; i--)
              ((Observer)arrLocal[i]).update(this, arg);
      }
  }
  ```

  ```java
  public interface Observer {
      /**
       * This method is called whenever the observed object is changed. An
       * application calls an <tt>Observable</tt> object's
       * <code>notifyObservers</code> method to have all the object's
       * observers notified of the change.
       *
       * @param   o     the observable object.
       * @param   arg   an argument passed to the <code>notifyObservers</code>
       *                 method.
       */
      void update(Observable o, Object arg);
  }
  ```

- # 总结

  1) 观察者模式设计后，会以集合的方式来管理用户(Observer)，包括注册，移除和通知。

  2) 我们增加观察者(这里可以理解成一个新的公告板)，就不需要去修改核心类WeatherData不会修改代码，遵守了ocp原则。