package test;
/**java三大特性：
 *    封装，继承，多态
 *   继承：子类可以调用父类的属性和方法
 *  类加载过程：
 *    1.先加载父类的静态块
 *    2.加载子类的静态块
 *    3.加载父类的非静态块
 *    4.加载父类的构造器
 *    5.加载子类的非静态块
 *    6.加载子类的构造器
 *    7.对象调用方法(如果子类重写父类方法就调用自己的)
 *    
 *    重写：发生在两个类中（子类，父类）
 *    	 方法签名相同（方法名+参数类型） 
 *       返回值类型也需要一样
 *    
 *    重载： 发生一个类中
 *       方法名相同，方法参数的类型不同或者个数不同，
 *       与方法的返回值类型无关
 *    
 *    
 *    
 *    
 *    
 * */
public class ExtendsDemo {
	public static void main(String[] args) {
		Dog hsq = new HaShiQi();//里氏替换原则
//		HaShiQi h = new Dog();
		System.out.println(hsq.age);//
		System.out.println(hsq.name);//
		hsq.run();//重写
		hsq.eat();//
		Dog d = new Dog();
		d.run();
//		hsq.walk();//哈士奇走路
	}
}
/**父类
 * */
class Dog{
	int age = 2;//年龄
	String color;//颜色
	String name = "狗";//类别
	public void run(){
		System.out.println("狗都会跑~~");
	}
	public void eat(){
		System.out.println("狗都会吃~~");
	}
}
class HaShiQi extends Dog{
	int age = 5;
	String name = "哈士奇";
	String color = "白色";
	double weight;
	//重写
	public void run(){
		System.out.println("哈士奇也会跑");
	}
	//子类自定义方法
	public void walk(){
		System.out.println("哈士奇可以站着走路");
	}
	
}





