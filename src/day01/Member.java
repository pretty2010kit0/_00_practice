package day01;

import java.util.Scanner;

public class Member {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个成员：");
		String first = scanner.next();
		System.out.println("请输入第二个成员：");
		String second = scanner.next();
		scanner.close();
		System.out.println(first + " and " + second);
	}
}