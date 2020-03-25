package com.design.pattern.liskov;
/**
 * @ClassName: Liskov01
 * =================================================
 * @Description: Java设计模式里式替代原则
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/25 22:41
 * @Version: V1.0
 */
public class Liskov01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("11-3=" + a.func1(11, 3));
		System.out.println("1-8=" + a.func1(1, 8));

		System.out.println("-----------------------");
		B b = new B();
		//这里本意是求出11-3
		System.out.println("11-3=" + b.func1(11, 3));
		// 1-8
		System.out.println("1-8=" + b.func1(1, 8));
		System.out.println("11+3+9=" + b.func2(11, 3));



	}

}

class A {
	/**
	 * 返回两个数的差
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int func1(int num1, int num2) {
		return num1 - num2;
	}
}

/**
 * // B类继承了A
 * // 增加了一个新功能：完成两个数相加,然后和9求和
 */
class B extends A {
	/**
	 * 这里，重写了A类的方法, 可能是无意识
	 * @param a
	 * @param b
	 * @return
	 */
	@Override
	public int func1(int a, int b) {
		return a + b;
	}

	public int func2(int a, int b) {
		return func1(a, b) + 9;
	}
}
