package JVM;

public class StaticTest2 {
	static{
		b = 6;
		System.out.println("--------static块--------");
	}
	static int a = 5;
	static int b = 9;//1
	static int c;//没有指定初值，采用默认初始值0
	public static void main(String[] args) {
		System.out.println(StaticTest2.a);
		System.out.println(StaticTest2.b);
		System.out.println(StaticTest2.c);
	}
}
/**上面代码先在静态初始化块中为b赋值，b = 6；接着程序向下执行，
 * 执行到1号代码处，这行代码也属于类的初始化语句，所以程序再次
 * 为静态Field b赋值 ，b = 9.
 * 
 * 声明变量时指定初始值和静态初始化块都是类的初始化语句，JVM会按
 * 这些语句在程序中的排列顺序依次执行它们。*/
