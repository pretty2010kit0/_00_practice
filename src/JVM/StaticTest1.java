package JVM;
/**
--类的初始化
类的初始化阶段，虚拟机负责对类进行初始化，主要就是对静态Field进行初始化。
在Java类中对静态Field指定初始值有两种方式：
1）声明静态Field时指定初始值。
2）使用静态初始化块为静态Field指定初始值。
*/
public class StaticTest1 {
	static int a = 5;
	static int b;
	static int c;//没有指定初值，采用默认初始值0
	static{
		b = 6;
	}
	public static void main(String[] args) {
		System.out.println(StaticTest1.a);
		System.out.println(StaticTest1.b);
		System.out.println(StaticTest1.c);
	}
}
