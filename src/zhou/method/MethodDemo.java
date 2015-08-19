<<<<<<< HEAD
package zhou.method;

public class MethodDemo {

	public static void main(String[] args) {
		// 值 3.0 和 5.0 分别作为 value1 和 value2 的初始值
		double x5 = MyClass.mean(3.0, 5.0);
		System.out.println(x5);
	}
	

}

class MyClass{
	// 修饰符 修饰符 返回值类型 方法名 参数列表
	public static double mean(double value1, double value2){
		// 方法体 开始------------------------------------------------
		// result这个变量只在mean()方法的方法体中存在。每次执行mean()方法时，
		// 都会重新创建这个变量，并且当mean()方法执行完之后，这个变量会被销毁。
		// 在方法体中声明的所有变量都只在方法内部有效，而且只有执行方法时才会存在。
		// 在方法内部声明的变量称为局部变量，因为它们只在方法内部有效。局部变量不会
		// 自动被初始化。
		double result = (value1 + value2)/2.0; 
		return result; // 这是mean()方法的返回值
		// 方法体 结束------------------------------------------------
	}
	/**
	 * 在写方法的代码时，有4种不同的潜在数据源可供使用：
	 * 1 传递给方法的参数，通过使用参数名来引用它们
	 * 2 数据成员，包括实例变量和类变量，通过它们的名字进行引用。
	 * 3 在方法体中声明的局部变量
	 * 4 在方法内部调用的由其他方法返回的值
	 * 
	 * 
	 * 在方法内部声明的变量为局部变量，只在方法内部有效。
	 * 
	 */
}
=======
package zhou.method;

public class MethodDemo {

	public static void main(String[] args) {
		// 值 3.0 和 5.0 分别作为 value1 和 value2 的初始值
		double x5 = MyClass.mean(3.0, 5.0);
		System.out.println(x5);
	}
	

}

class MyClass{
	// 修饰符 修饰符 返回值类型 方法名 参数列表
	public static double mean(double value1, double value2){
		// 方法体 开始------------------------------------------------
		// result这个变量只在mean()方法的方法体中存在。每次执行mean()方法时，
		// 都会重新创建这个变量，并且当mean()方法执行完之后，这个变量会被销毁。
		// 在方法体中声明的所有变量都只在方法内部有效，而且只有执行方法时才会存在。
		// 在方法内部声明的变量称为局部变量，因为它们只在方法内部有效。局部变量不会
		// 自动被初始化。
		double result = (value1 + value2)/2.0; 
		return result; // 这是mean()方法的返回值
		// 方法体 结束------------------------------------------------
	}
	/**
	 * 在写方法的代码时，有4种不同的潜在数据源可供使用：
	 * 1 传递给方法的参数，通过使用参数名来引用它们
	 * 2 数据成员，包括实例变量和类变量，通过它们的名字进行引用。
	 * 3 在方法体中声明的局部变量
	 * 4 在方法内部调用的由其他方法返回的值
	 * 
	 * 
	 * 在方法内部声明的变量为局部变量，只在方法内部有效。
	 * 
	 */
}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
