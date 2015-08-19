<<<<<<< HEAD
package suanfa;

import java.math.BigDecimal;

public class Sum100ByRecursion {
	
	public static void main(String[] args) {
		
//		System.out.println(sum(100));
		System.out.println(mul0(1000));
//		System.out.println(mul1(21));
		System.out.println(mul2(new BigDecimal(1000)));
	}
	
	/**
	 * 使用递归计算1+2+3+....+a的和
	 *
	 * @param a 求和参数
	 * @return 求和结果
	 */
	public static long sum(long a){
		if(a == 1){
			return 1;
		}
		return a+sum(a-1);
		// sum(a) = a + sum(a-1);
		// sum(a-1) = (a-1) +sum(a-2)
		// ...
		// sum(3) = 3 + sum(2)
		// sum(2) = 2 + sum(1);
		//        = 2 + 1;
	}
	
	public static double mul0(double a){
		if(a == 1){
			return 1;
		}
		return a*mul0(a-1);
	}
	
	/**
	 * 1*2*3 * ...  * n
	 *
	 * @param a 阶乘参数
	 * @return 阶乘计算结果
	 */
	public static long mul1(long a){
		if(a == 1){
			return 1;
		}
		return a*mul1(a-1);
	}
	
	/**
	 * 设置要使用的BigDecimal常量
	 */
	public static BigDecimal END = new BigDecimal(1);
	/**
	 * 使用BigDecimal类求阶乘
	 *
	 * @param a 阶乘参数
	 * @return BigDecimal 阶乘计算结果
	 */
	public static BigDecimal mul2(BigDecimal a){
		if(END.equals(a)){
			return END;
		}
		BigDecimal next = a.subtract(END);
		return a.multiply(mul2(next));
	}
}
=======
package suanfa;

import java.math.BigDecimal;

public class Sum100ByRecursion {
	
	public static void main(String[] args) {
		
//		System.out.println(sum(100));
		System.out.println(mul0(1000));
//		System.out.println(mul1(21));
		System.out.println(mul2(new BigDecimal(1000)));
	}
	
	/**
	 * 使用递归计算1+2+3+....+a的和
	 *
	 * @param a 求和参数
	 * @return 求和结果
	 */
	public static long sum(long a){
		if(a == 1){
			return 1;
		}
		return a+sum(a-1);
		// sum(a) = a + sum(a-1);
		// sum(a-1) = (a-1) +sum(a-2)
		// ...
		// sum(3) = 3 + sum(2)
		// sum(2) = 2 + sum(1);
		//        = 2 + 1;
	}
	
	public static double mul0(double a){
		if(a == 1){
			return 1;
		}
		return a*mul0(a-1);
	}
	
	/**
	 * 1*2*3 * ...  * n
	 *
	 * @param a 阶乘参数
	 * @return 阶乘计算结果
	 */
	public static long mul1(long a){
		if(a == 1){
			return 1;
		}
		return a*mul1(a-1);
	}
	
	/**
	 * 设置要使用的BigDecimal常量
	 */
	public static BigDecimal END = new BigDecimal(1);
	/**
	 * 使用BigDecimal类求阶乘
	 *
	 * @param a 阶乘参数
	 * @return BigDecimal 阶乘计算结果
	 */
	public static BigDecimal mul2(BigDecimal a){
		if(END.equals(a)){
			return END;
		}
		BigDecimal next = a.subtract(END);
		return a.multiply(mul2(next));
	}
}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
