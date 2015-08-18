package JVM;

public class ATest2 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// 创建A类实例
		A b = new A();
		// 输出b实例的a Field值
		System.out.println(b.a);
	}
}


















/**ATest1的结果是7，没有什么疑问。
 * ATest2的结果是6，这是因为ATest1和ATest2是两次运行JVM进程，
 * 第一次运行JVM结束后，它对A类所做的修改将全部丢失。第二次
 * 运行JVM时将再次初始化A类*/