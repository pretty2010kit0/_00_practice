package test;

import java.util.Arrays;

public class ArrDemo {
	public static void main(String[] args) {
		//java中没有二维数组
		//数组中的元素还是数组
		int[][] arr = new int[3][4];
//		{{,,,},{,,,},{,,,}}
		arr[1][1] = 2;
		for(int i=0;i<arr.length;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}

