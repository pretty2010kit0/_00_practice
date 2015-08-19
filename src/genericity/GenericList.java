<<<<<<< HEAD
package genericity;

import java.util.ArrayList;
import java.util.List;

/**对于前面的ListErr.java程序，可以使用泛型改进这个程序*/
public class GenericList {
	public static void main(String[] args) {
		//创建一个只想保存字符串的List集合
		List<String> strList = new ArrayList<String>();//1
		strList.add("疯狂Java讲义");
		strList.add("疯狂Android讲义");
		strList.add("轻量级 Java EE 企业级应用实战");
		//下面代码将引起编译错误
//		strList.add(5);//2
		for (int i = 0; i < strList.size(); i++) {
			//下面代码无须进行强制类型转换
			String str = strList.get(i);//3
		}
	}
}
=======
package genericity;

import java.util.ArrayList;
import java.util.List;

/**对于前面的ListErr.java程序，可以使用泛型改进这个程序*/
public class GenericList {
	public static void main(String[] args) {
		//创建一个只想保存字符串的List集合
		List<String> strList = new ArrayList<String>();//1
		strList.add("疯狂Java讲义");
		strList.add("疯狂Android讲义");
		strList.add("轻量级 Java EE 企业级应用实战");
		//下面代码将引起编译错误
//		strList.add(5);//2
		for (int i = 0; i < strList.size(); i++) {
			//下面代码无须进行强制类型转换
			String str = strList.get(i);//3
		}
	}
}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
