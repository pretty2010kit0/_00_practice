<<<<<<< HEAD
package zhou.chararr;

public class ABC {

	public static void main(String[] args) {

		String letters = "ABC";

		char[] numbers = { '1', '2', '3' };
		
		System.out.println(numbers);

		System.out.println(letters + " easy as " + numbers);

	}
	/*
	 * 总结：String.valueOf、StringBuffer.append以及System.out.print中
	 * 都对char[]数组单独处理，即进行了重载，使之可以输出内容（或者对内容操作处理），
	 * 而不是地址。
	 * 
	 * 但是字符串拼接操作没有对char[]数组单独处理,所以它处理的是数组char[]的地址
	 * 
	 * 程序输出：ABC easy as [C@1fb8ee3，而不是ABC easy as 123。
	 * */
}
=======
package zhou.chararr;

public class ABC {

	public static void main(String[] args) {

		String letters = "ABC";

		char[] numbers = { '1', '2', '3' };
		
		System.out.println(numbers);

		System.out.println(letters + " easy as " + numbers);

	}
	/*
	 * 总结：String.valueOf、StringBuffer.append以及System.out.print中
	 * 都对char[]数组单独处理，即进行了重载，使之可以输出内容（或者对内容操作处理），
	 * 而不是地址。
	 * 
	 * 但是字符串拼接操作没有对char[]数组单独处理,所以它处理的是数组char[]的地址
	 * 
	 * 程序输出：ABC easy as [C@1fb8ee3，而不是ABC easy as 123。
	 * */
}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
