<<<<<<< HEAD
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

=======
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

>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
