package suanfa;
import java.util.*;
public class DuiGuiJieCheng {

	/**
	 * 用递归原理实现阶乘
	 */
	public static void main(String[] args) {
		System.out.print("输入一个正整数:");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		long y=f(n);
		System.out.println(n+"!= "+y);
	}
	public static long f(int n){
		if(n==1) return 1;
		return n*f(n-1);
	}

}