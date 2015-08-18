package test;

import java.util.Arrays;
import java.util.Random;

public class ShuangSeQiu {
	public static void main(String[] args) {
		String[] str1 = new String[7];
		int[] s1 = new int[6];
		Random ran = new Random();
		for (int i = 0; i < s1.length; i++) {
			s1[i] = ran.nextInt(33) + 1;
			for (int j = 0; j < i; j++) {
				if (s1[i] == s1[j]){
					i--;
					break;
				 }
			}
		}
		Arrays.sort(s1);
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] < 10) {
				str1[i] = "0" + s1[i] + " ";
			} else {
				str1[i] = s1[i] + " ";
			}
		}
		int a = ran.nextInt(16) + 1;
		if (a < 10) {
			str1[6] = "   0" + a;
		} else {
			str1[6] = "   " + a;
		}
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]);
		}
	}
}