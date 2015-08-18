package test;

public class TestInteger {

	public static void main(String[] args) {
		TestInteger t = new TestInteger();
		t.testParseInt();
	}

	/**
	 * 测试Integer的parseInt方法
	 */
	public void testParseInt() {
		String str = "123";
		int value = Integer.parseInt(str);
		System.out.println(value); // 123

		str = "壹佰贰拾叁";
		value = Integer.parseInt(str);
		/**
		 * 从异常情况可以看出，Java程序无法将字符串"壹佰贰拾叁"转换为int类型，因此，抛出了java.lang.
		 * NumberFormatException异常。所以在使用Integer的parseInt方法时，要注意传入的方法的参数为数字。
		 */
	}

}