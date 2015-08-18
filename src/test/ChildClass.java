package test;
//A B C D
public class ChildClass extends SuperClass{
	static{
		System.out.println("子类静态块");
	}
	{
		System.out.println("子类非静态块");
	}
	public ChildClass(){
		System.out.println("子类构造器");
	}
	public void f(String x){
		System.out.println("子类方法f（）");
	}
	public void f(int num){
	}
	public void f(){}
	public static void main(String[] args) {
		new ChildClass().f(5);
	}
}
