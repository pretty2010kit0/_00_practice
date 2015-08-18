package zhou.classdemo;

public class SphereTest {
	public static void main(String[] args) {
		// 测试使用构造方法复制对象
		Sphere first = new Sphere();
		first.radius = 5.0;
		Sphere second = new Sphere(first);
		System.out.println(first.radius);
		System.out.println(second.radius);
		
		first.radius = 6.0;
		second.radius = 9.0;
		System.out.println(first.radius);
		System.out.println(second.radius);
		
	}
}
