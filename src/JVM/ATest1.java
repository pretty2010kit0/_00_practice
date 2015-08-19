package JVM;

class A {
	// 定义该类的静态Field
	public static int a = 6;
}

public class ATest1 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 创建A类实例
		A a = new A();
		// 让a实例的a Field值自加
		a.a++;
		System.out.println(a.a);
	}
}
