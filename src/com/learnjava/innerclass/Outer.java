package com.learnjava.innerclass;

public class Outer {
	int times = 5;
	public static void main(String[] year2014month05day16) {
//		Inner obj = new Inner();//编译错误
		//实例化内部类 方法1 直接使用父类的对象创建内部类
		Outer outer = new Outer();
		Inner inner1 = outer.new Inner();//不常用
		System.out.println(outer.times);
		System.out.println(inner1.times);
		System.out.println("------------------");
		
		//实例化内部类 方法2 在父类中创建内部类
		Inner inner2 = outer.test();
		System.out.println(outer.times);
		System.out.println(inner1.times); // 这个内部类的times没有改变
		System.out.println(inner2.times); 
		System.out.println(inner1.name);
		System.out.println(inner2.name);
		
	}
	public Inner test(){
		Inner inner = this.new Inner();
		inner.test();
		return inner;
	}
	
	//-----------------Inner------------------
	private class Inner{
		int times = 10;
		private String name = "zhou"; 
		public void test(){
			Outer.this.times++; // 外部类的times
			this.times--; // 内部类的times
			name = "zhang";
		}
	}
	//--------------------------------------------------
}
