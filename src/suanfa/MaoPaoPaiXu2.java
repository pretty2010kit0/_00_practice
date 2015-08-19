package suanfa;

import java.util.Arrays;
public class MaoPaoPaiXu2 {

	/**
	 * 冒泡排序的封装和使用
	 */
	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			a[i]=(int)(Math.random()*10000);
		}
		System.out.println("随机产生的数组为:\n"+Arrays.toString(a));
		MaoPao(a);
		System.out.println("该数组冒泡排序后为:\n"+Arrays.toString(a));
		b=MaoPao2(a);
		System.out.println("b[]=:\n"+Arrays.toString(b));
	}
	/**封装冒泡排序算法,实现整数数组的升序排列
	 * 
	 */
	public static void MaoPao(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp; 
				}
			}
		}
	}
	
	public static int[] MaoPao2(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp= arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp; 
				}
			}
		}
		return arr;
	}
	
}
