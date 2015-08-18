package test;

public class TestNum {
	// 测试Number的intValue方法和doubleValue方法

	public static void main(String[] args) {
		testIntValueAndDoubleValue();
	}

	public static void testIntValueAndDoubleValue() {
		Number d = 123.45;
		Number n = 123;

		// 输出d和n对象所属的类型
		System.out.println(d.getClass().getName());// java.lang.Double
		System.out.println(n.getClass().getName());// java.lang.Integer

		// 将d对象分别转换为int类型变量和double类型变量
		int intValue = d.intValue();
		double doubleValue = d.doubleValue();
		System.out.println(intValue + "," + doubleValue); // 123,123.45
		
		// 将n对象分别转换为int类型变量和double类型变量
		intValue = n.intValue();
		doubleValue = n.doubleValue();
		System.out.println(intValue + "," + doubleValue); // 123,123.0
	}
}
