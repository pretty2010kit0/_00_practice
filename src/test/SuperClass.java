package test;

public class SuperClass {
	public SuperClass(){
		System.out.println("父类构造器");
	}
	static{
		System.out.println("父类静态块");
	}
	{
		System.out.println("父类非静态块");
	}
	public void f(int num){
		System.out.println("父类方法f（）");
	}
	public static void main(String[] args) {
		new SuperClass();
	}
}

