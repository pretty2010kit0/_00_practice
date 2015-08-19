package AooBooCoo;

public class Test {
	public static void main(String[] args) {
		Coo c = new Coo();
		Aoo p = new Boo();
		c.say(p);
		((A)new B()).start();
	}
}

class A{
	public void start(){
		System.out.println("A");
	}
}
class B extends A{
	public void start(){
		System.out.println("B");
	}
}

//-------------------------------------------
interface AA{
	public void doSomething(String thing);
}
interface BB{
	
}
interface CC extends AA,BB{
	
}
interface DD{
	public void doIt(String thing);
}
class AAImpl implements CC,DD{
	public void doSomething(String thing) {
	}
	public void doIt(String thing) {
	}
}
