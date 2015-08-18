package test;


public class TestObject {
	public static void main(String[] args) {
		test36();
//		testCast();
	}
	public static void test36(){
		/**java 编译器：在检查类型转换时，如果没有可能发生类型转换，
		 * 就有编译错误*/
		Object o = null;
		A a = null;
		a = (A)o;//o引用的对象可能是A类型的
		B b = null;
//		b = (B)a;//a引用的对象没有可能是b类型的
//		C c = (C)b;//b引用的对象没有可能是C类型的对象
		C c1 = (C)a;//a引用的对象可能是C类型的对象
		C c2 = (C) new A();//运行期出错
//		C c4 =(C)new B();
		Object x = b;
		C c5 = (C)x;
	}

	public static void testCast(){
		僵尸 js;
		草地 cd;
		奖励 jl;
		铁帽僵尸 t;
//		奖励 x =(奖励)cd;
		js = new 僵尸();
		奖励 y =(奖励)js;//运行期出错
		Object 东西;
		东西 = new Object();
		奖励 z = (奖励)东西;
//		奖励 k = (奖励)new 草地();
		奖励 f = (奖励)new 僵尸();
		
	}

}
//class D extends A implements C{}
class A {}
//final class B implements C{}
final class B {}
interface C {}

class 僵尸{}
final class 草地{}
interface 奖励{}
class 铁帽僵尸 extends 僵尸 implements 奖励{}

