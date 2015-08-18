package suanfa;

import java.util.Scanner;

public class ZhiShu {

	public static void main(String[] args) {
		/*
		 * 质数又称素数，指在大于1的自然数中，除了1和此整数自身外，
		 * 不能被其它自然数整除的数。
		 *
		 * 本案例要求使用交互的方式找出从 2 开始到某个数值范围内的所有质数，
		 * 并输出结果。 因为输出的质数可能较多，要求分行输出，每行最多输出 10
		 * 个质数。
		 */
		/* 
		 * 方法1 直接法
		 * 判断一个正整数n是不是质数，最直接的方法就是，依次判断n能不能
		 * 被2~(n-1)的正整数整除，
		 * 若能整除，则不是质数
		 * 若不能整除，则是质数
		 * */
//		Scanner scan = new Scanner(System.in);
//		System.out.print("请输入质数查找范围：2~");
//		int n = scan.nextInt(); // 质数查找范围
//		int num = 0; // 质数的个数
//		for (int i = 2; i <= n; i++) { // 遍历2~n 的所有整数
//			boolean flag = true; // 是否是质数
//			for (int j = 2; j < i; j++) { // 判断当前整数i是否能被2到(i-1)之间的整数整除
//				if (i % j == 0) {
//					flag = false; // 不是质数
//					break;
//				}
//			}
//			if(flag == true){
//				num++; // 质数个数+1
//				System.out.print(i + " "); // 输出这个质数
//				if (num % 10 == 0) { // 每输出10个质数
//					System.out.println(); // 换行
//				}
//			}
//		}
//		System.out.println("\n共有" + num + "个质数");
		
		/*
		 * 方法2
		 * 
		 * 那么如何判断一个数是否为质数呢，如果一个数 n 不是质数，那么它一定是
		 * 某两个整数的乘积。此时，如果其中一个整数大于 n 的平方根，那么必定能
		 * 找到一个小于 n 的平方根的整数和它成对。例如，81的平方根是9，那么，
		 * 我们只需要判断从2到9之间是否有整数可以整除 81 即可。因此，在判断数值n
		 * 是否为质数时，需要让 n 除以 2 到 n 的平方根之间的每一个整数。在此范围
		 * 内，如果 n 能被2 到 n (n大于2)的平方根之间的某个数整除，则说明n不是
		 * 质数，否则n一定是质数。
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入质数查找范围：2~");
		int n = scan.nextInt(); // 质数查找范围上限
		int sum = 0; // 质数的个数
		for (int i = 2; i <= n; i++) {
			boolean flag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i%j==0){
					flag = false;
					break;
				}
			}
			if(flag == true){
				sum++;
				System.out.print(i + " ");
				if(sum%10 == 0){
					System.out.println();
				}
			}
		}
		System.out.println("\n共有" + sum + "个质数");
		
		

	}

}
