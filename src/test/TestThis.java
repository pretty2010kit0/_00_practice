package test;
/**成员变量和局部变量的区别。本例子的用法是一个反面案例
 * y+=y; 
 * 其中的两个y都是局部变量，即step方法的形参y。
 * 如果要引用成员变量y，应使用this.y
 * (当形参和成员变量名字相同时，为区分两者成员变量前必须加this
 *  当形参和成员变量名字不同时，可以省略成员变量前面的this)
 * */
public class TestThis {
	int y = 7;
	public void step(int y){
		y+=y;//变量名相同时必须用this才能分清，否则默认为最近的。
		System.out.println(y);
	}
	public static void main(String[] args) {
		TestThis p = new TestThis();
		p.step(10);
	}
}
