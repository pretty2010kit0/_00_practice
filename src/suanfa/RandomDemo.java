package suanfa;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random ran1 = new Random();
		int max = 0;
		for (int i = 0; i <1000000; i++) {
			int a = ran1.nextInt();//-2147483648  ---2147483647
			if (a>max) {
				max = a;
			}
		}
		System.out.println(max);
	}
}
