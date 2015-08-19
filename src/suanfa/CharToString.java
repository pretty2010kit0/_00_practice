package suanfa;

import java.util.Arrays;

public class CharToString {
	public static void main(String[] args) {
		String str = "aksjhdkjah";
		char[] arr = str.toCharArray();
		System.out.println(str);
		System.out.println(Arrays.toString(arr));
		String str1="";
		for (int i = 0; i < arr.length; i++) {
			str1+=arr[i];
		}
		System.out.println(str1);
	}
}
