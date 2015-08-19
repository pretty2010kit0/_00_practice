package zhou.tools;

/**
 * 可变长参数
 * @author Administrator
 *
 */
public class ArgDemo {
	public static void main(String[] args) {
		dosome1("1",1,2,67,43,55,35,23);
		System.out.println();
		dosome2("1",1,2,67,43,55,35,23);
	}
	/**
	 * 变长参数，方法内部使用时是以数组的形式展现。
	 * JDK1.5之后开始支持。
	 * 变长参数在一个方法中只能有一个，且必须是最后
	 * 一个参数。
	 * @param a
	 */
	public static void dosome1(String s,int... a){
		for(int n : a){
			System.out.print(n + " ");
		}
	}
	
	/**
	 * 可以传任何类型，任意个数的参数
	 * @param arr
	 */
	public static void dosome2(Object... arr){
		for (Object o : arr)
		{
			System.out.print(o + " ");
		}
	}
}



