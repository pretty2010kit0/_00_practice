<<<<<<< HEAD
package genericity;

import java.util.ArrayList;
import java.util.List;

//自定义一个StrList集合类，使用组合的方式来复用ArrayList类
class StrList {
	private List strList = new ArrayList();

	// 定义StrList的add方法
	public boolean add(String ele) {
		return strList.add(ele);
	}

	public String get(int index) {
		return (String) strList.get(index);
	}

	public int size() {
		return strList.size();
	}
}

public class CheckType {
	public static void main(String[] args) {
		// 创建一个只想保存字符串的List集合
		StrList strList = new StrList();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Ajax讲义");
		strList.add("轻量级Java EE企业应用实战");
		//下面语句不能把Integer对象丢进集合中，否则将引起编译错误
//		strList.add(5);// 1
		System.out.println(strList);
		for (int i = 0; i < strList.size(); i++) {
			/*
			 * 因为StrList里元素的类型就是String类型
			 * 所以无需进行强制类型转换
			 */
			String str = strList.get(i);// 2
		}
	}
	/**上面程序中的StrList类就实现了编译时的异常检查，当程序在1处
	 * 试图将一个Integer对象添加到SteList集合中时，程序将无法通过
	 * 编译。因为StrList只接受String对象作为元素，所以1处代码在编
	 * 译时会得到错误提示。
	 * 从代码的健壮性角度来看，该方法及其有用，而且使用get()方法返
	 * 回集合元素时，无需进行类型转换。
	 * 这种做法虽然有效，但局限性非常明显--程序员需要定义大量的List
	 * 子类，这是一件让人沮丧的事情。从Java5以后，Java引入了“参数
	 * 化类型(parameterized type)”的概念，允许我们在创建集合时指
	 * 定集合元素的类型。如List<String>，这表明该List只能保存字符串
	 * 类型的对象。Java的参数化类型被称为泛型(generic)*/
	
}
=======
package genericity;

import java.util.ArrayList;
import java.util.List;

//自定义一个StrList集合类，使用组合的方式来复用ArrayList类
class StrList {
	private List strList = new ArrayList();

	// 定义StrList的add方法
	public boolean add(String ele) {
		return strList.add(ele);
	}

	public String get(int index) {
		return (String) strList.get(index);
	}

	public int size() {
		return strList.size();
	}
}

public class CheckType {
	public static void main(String[] args) {
		// 创建一个只想保存字符串的List集合
		StrList strList = new StrList();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Ajax讲义");
		strList.add("轻量级Java EE企业应用实战");
		//下面语句不能把Integer对象丢进集合中，否则将引起编译错误
//		strList.add(5);// 1
		System.out.println(strList);
		for (int i = 0; i < strList.size(); i++) {
			/*
			 * 因为StrList里元素的类型就是String类型
			 * 所以无需进行强制类型转换
			 */
			String str = strList.get(i);// 2
		}
	}
	/**上面程序中的StrList类就实现了编译时的异常检查，当程序在1处
	 * 试图将一个Integer对象添加到SteList集合中时，程序将无法通过
	 * 编译。因为StrList只接受String对象作为元素，所以1处代码在编
	 * 译时会得到错误提示。
	 * 从代码的健壮性角度来看，该方法及其有用，而且使用get()方法返
	 * 回集合元素时，无需进行类型转换。
	 * 这种做法虽然有效，但局限性非常明显--程序员需要定义大量的List
	 * 子类，这是一件让人沮丧的事情。从Java5以后，Java引入了“参数
	 * 化类型(parameterized type)”的概念，允许我们在创建集合时指
	 * 定集合元素的类型。如List<String>，这表明该List只能保存字符串
	 * 类型的对象。Java的参数化类型被称为泛型(generic)*/
	
}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
