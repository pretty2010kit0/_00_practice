package zhou.classdemo;

/**
 * 
 * 初始化数据成员
 * 
 * 初始化代码块是指位于两个花括号{}之间的一段代码，它们在类的对象创建之前执行。 有两种类型的初始化代码块： 
 * 1 静态初始化代码块
 * 静态初始化代码块是使用关键字static定义的代码块，只在类加载时执行一次。 静态初始化代码块只能初始化类的静态数据成员。
 * 
 * 2 非静态初始化代码块 
 * 非静态初始化代码块在每次创建对象时都执行一次，所以能够初始化类中的实例变量。
 * 
 */
class TryInitialization {

	int[] values0 = new int[10]; 		// 成员变量
	static int[] values1 = new int[10]; 	// 静态变量
	
	// 非静态初始化代码块，在每次new对象时都执行一次
	{	
		System.out.println("执行非静态代码块.");
		for (int i = 0; i < values0.length; ++i) {
			values0[i] = (int) (100.0 * Math.random());
		}
	}

	// 静态初始化代码块,在类加载时执行(创建对象之前)，只执行一次
	static {
		System.out.println("执行静态代码块.");
		for (int i = 0; i < values1.length; ++i) {
			values1[i] = (int) (100.0 * Math.random());
		}
	}

	// 非静态方法，打印成员变量
	void listValues0() {
		System.out.println(); // Start a new line
		for (int value : values0) {
			System.out.print(" " + value); // Display values
		}
		System.out.println(); // Start a new line
	}
	
	// 非静态方法，打印静态变量
	void listValues1() {
		System.out.println(); // Start a new line
		for (int value : values1) {
			System.out.print(" " + value); // Display values
		}
		System.out.println(); // Start a new line
	}

	// 静态方法,只能打印静态变量
	static void listValues11() {
		System.out.println(); // Start a new line
		for (int value : values1) {
			System.out.print(" " + value); // Display values
		}
		System.out.println(); // Start a new line
	}
	

	// 演示静态代码块 values1是静态变量，只有一份，三次输出结果一致
//	public static void main(String[] args) {
//		System.out.println("\nNo object:");
//		TryInitialization.listValues11();
//
//		TryInitialization example = new TryInitialization();
//		System.out.println("\nFirst object:");
//		example.listValues1();
//
//		example = new TryInitialization();
//		System.out.println("\nSecond object:");
//		example.listValues1();
//	}
	
	// 演示非静态代码块 value0是成员变量，每个对象一份，两次输出结果不同
	public static void main(String[] args) {
		TryInitialization example = new TryInitialization();
		System.out.println("\nFirst object:");
		example.listValues0();

		example = new TryInitialization();
		System.out.println("\nSecond object:");
		example.listValues0();
	}
	
}
