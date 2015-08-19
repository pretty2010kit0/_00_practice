package test;

public class TestDebug {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println("a");
		System.out.println("b");
		System.out.println(3);
		System.out.println("现在进入for循环");
		for (int i = 0; i < 10; i++) {
			System.out.println("我是："+i);
			for (int j = 0; j < 3; j++) {
				System.out.println("她是"+j);
			}
		}
		System.out.println("debug测试完毕");
	}
}
