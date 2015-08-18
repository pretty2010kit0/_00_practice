package test;

import java.util.Scanner;

public class IntOrDouble {
	public static void main(String[] args) {
		System.out.println("请输入一个数字：");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (str.matches("^\\d+$")) {
			System.out.println("这是一个整数:"+str);
		}else if(str.matches("^\\d+\\.\\d+$")){
			System.out.println("这是一个小数:"+str);
		}else{
			System.out.println("数字格式不正确！");
		}
	}
}
