package test;

public class TestCell1 {
	private final int id;
	public TestCell1(int id){
		this.id=id;
	}
	public void updateId(int id){
//		this.id = id;
	}
	public static void main(String[] args) {
		TestCell1 c = new TestCell1(1001);
		c.updateId(1002);
		System.out.println(c.id);
	}
}
/**final修饰成员变量，意为初始化后不可改变。
 * 该成员变量必须初始化，可以在声明时初始化或在
 * 构造方法中初始化。
 * 本题在构造方法中给final修饰的成员变量id初始化，
 * 然后又在uodateId方法中改变id的值，这就违反了
 * final修饰成员变量的语法。因此会有编译错误。
 * */
