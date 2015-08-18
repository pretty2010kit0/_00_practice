package test;

public class TestNullPointerException {
	Integer i;
	int x;
	public TestNullPointerException(int y) {
		System.out.println(i);
		x = i+y;
		System.out.println(x);
	}
	public static void main(String[] args) {
		System.out.println(new Integer(4));
		System.out.println(new Integer(4).intValue());
		new TestNullPointerException(new Integer(4));
	}
}
/**本题考察NullPointerException
 * 当应用程序试图在需要对象的地方使用null时，抛出该异常。
 * 本题中，在编译代码"x=i+y"时，要对i进行自动拆箱，即相
 * 当于代码"x=i.intValue()+y"，但此时i的属性值为null,
 * 因此抛出空指针异常。
 * 
 * int intValue(); 以int类型返回该Integer的值。
 * */
