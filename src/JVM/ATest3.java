package JVM;

public class ATest3 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 创建A类实例
		A a = new A();
		// 让a实例的a Field值自加
		a.a++;
		System.out.println(a.a);
		
		// 创建A类实例
		A b = new A();
		// 输出b实例的a Field值
		System.out.println(b.a);
	}
}
