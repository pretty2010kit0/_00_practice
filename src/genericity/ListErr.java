<<<<<<< HEAD
package genericity;

import java.util.ArrayList;
import java.util.List;

/**泛型实例*/
public class ListErr {
	public static void main(String[] args) {
		//创建一个只想保存字符串的List集合
		List strList = new ArrayList();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Ajax讲义");
		strList.add("轻量级Java EE企业应用实战");
		//不小心把一个 Integer 对象丢进了 集合
		strList.add(5);//1
		for (int i = 0; i < strList.size(); i++) {
			/*因为List里取出的全部是Object，所以不需进行强制类型转换
			 * 最后一个元素将出现ClassCastException异常,因为程序试图把
			 * 一个Integer对象转换为String类型。*/
			String str = (String)strList.get(i);//2
		}
	}
}
=======
package genericity;

import java.util.ArrayList;
import java.util.List;

/**泛型实例*/
public class ListErr {
	public static void main(String[] args) {
		//创建一个只想保存字符串的List集合
		List strList = new ArrayList();
		strList.add("疯狂Java讲义");
		strList.add("疯狂Ajax讲义");
		strList.add("轻量级Java EE企业应用实战");
		//不小心把一个 Integer 对象丢进了 集合
		strList.add(5);//1
		for (int i = 0; i < strList.size(); i++) {
			/*因为List里取出的全部是Object，所以不需进行强制类型转换
			 * 最后一个元素将出现ClassCastException异常,因为程序试图把
			 * 一个Integer对象转换为String类型。*/
			String str = (String)strList.get(i);//2
		}
	}
}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
