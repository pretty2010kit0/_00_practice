package suanfa;

import java.math.BigInteger;

/**
 * 递归算法的简单演示
 * 
 * */
public class RecursionDemo {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(getPlus1(n));
		// 调用getPlus方法，获取n!，并将结果转化为字符串输出
		// getPlus(5) = 5*getPlus(4) =  5*4*getPlus(3) = 5*4*3*getPlus(2) = 5*4*3*2*getPlus(2)
		//            =
	}

	static int getPlus1(int n) {
		// 该方法获取n的阶乘
		if (n == 0){
			// 如果n是0，那么返回0!=1……(*)
			return 1;
		} else {
			// 如果n非0，那么返回(n-1)!*n……(**)
			return getPlus1(n - 1)*n;
		}
	}
	
	static BigInteger getPlus2(int n) {
		//该方法获取n的阶乘
		if(n==0) return new BigInteger("1");
		//如果n是0，那么返回0!=1……(*)
		return getPlus2(n - 1).multiply(new BigInteger(String.valueOf(n)));
		//如果n非0，那么返回(n-1)!*n……(**)
		}
	
}
