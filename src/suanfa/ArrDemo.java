package suanfa;

import java.util.Arrays;

public class ArrDemo {
	int age; // 成员变量  全局变量 属性
	public static void main(String[] args) {
		int[] arr = new int[5];
		String s = "123";
		arr[0] = Integer.parseInt(s);
		System.out.println(arr[0]);
		System.out.println(s.length());
		String[] ar = new String[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = "第"+(i+1)+"次你好";
		}
		System.out.println(Arrays.toString(ar));
		String[] a = new String[10];
		a= Arrays.copyOf(ar,5);
		System.out.println(Arrays.toString(a));
		a=Arrays.copyOf(ar,10);
		System.out.println(Arrays.toString(a));
		
		String[] str ={"a","b","c"};
		String[] st = new String[10];
		System.arraycopy(str, 0, st, 1, 3);
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(st));
		
		String[] arr1 = st.clone();
		System.out.println(Arrays.toString(arr1));
	}
}
