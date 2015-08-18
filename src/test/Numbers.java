package test;
/**继承中的构造方法
 * 子类的构造方法必须通过super关键字调用父类的构造方法，
 * 这样可以妥善的初始化继承自父类的成员变量。
 * 如果子类的构造方法中没有用super关键字调用父类的构造
 * 方法，Java编译器会自动的加入对父类无参构造方法的调用。
 * （即默认添加super();）*/
class One{
	public One(){
		System.out.print(1);
	}
}
class Two extends One{
	public Two(){
		System.out.print(2);
	}
}
class Three extends Two{
	public Three(){
		System.out.print(3);
	}
}

public class Numbers {
	public static void main(String[] args) {
		new Three();
	}
}
