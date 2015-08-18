package test;
/**不使用中间变量，交换两个数的值*/
public class ab_ba {
	public static void main(String[] args) {
		int a = 50;
		int b = 30;
		System.out.println("交换前：");
		System.out.println("a:"+a+",b:"+b);
		a = a+b;//a中放两者之和
		b = a-b;//b中放原来a的值
		a = a-b;//a中放原来b的值
		System.out.println("交换后：");
		System.out.println("a:"+a+",b:"+b);
	}
}
