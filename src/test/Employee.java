package test;
/**错误示例*/
class Person{
	String name =" ";
	public Person(String name){
		this.name=name;
	}
	public Person() {}//若不写无参构造器，13行编译出错
	
}
class employee1 extends Person{
	String empNo = "0000";
	public employee1(String empNo){//默认调用父类无参构造器时出错
		this.empNo = empNo;
	}
}

public class Employee {
	public static void main(String[] args) {
		employee1 e = new employee1("1109");
		System.out.println(e.empNo);
	}
}
