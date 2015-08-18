package zhou.extend;

class Person {
	String name = " ";

	public Person(String name) {
		this.name = name;
	}
}

class Employee extends Person {
	String empNO = "0000";

	public Employee(String empNO) {
		// 默认调用父类无参的构造方法，而父类中没有无参的构造方法，编译错误
		// 需要显式调用父类有参的构造方法
		super("zhou"); // 注释掉会编译错误
		this.empNO = empNO;
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee("1109");
		System.out.println(e.empNO);
	}
}
