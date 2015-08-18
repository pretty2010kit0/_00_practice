package suanfa;

import java.util.Arrays;
import java.util.Scanner;

public class MaoPaoPaiXu1 {

	/**
	 * 冒泡排序原理
	 */
	public static void main(String[] args) {
		System.out.println("请输入数组元素个数：");
		Scanner scanner =new Scanner(System.in);
		int o=scanner.nextInt();
		int sum1 = 0,sum2 = 0;
		int[] arr= new int[o];
		for(int i=0;i<arr.length;i++){
			System.out.println("请输入"+arr.length+"个整数中的第"+(i+1)+"个：");			
			arr[i]=scanner.nextInt();
		}
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		// 插入排序算法
		System.out.println(Arrays.toString(arr));
		System.out.println("冒泡排序开始：");
		for(int a=0;a<arr.length-1;a++){			
			for(int b=0;b<arr.length-1-a;b++){  //优化算法
				if(arr[b]>arr[b+1]){
					int k=arr[b];
					arr[b]=arr[b+1];
					arr[b+1]=k;
					sum2++;
				}
				sum1++;
			}
			
			System.out.println("第"+(a+1)+"次排序结果："+Arrays.toString(arr));
		}
		System.out.println("冒泡排序结束");
		System.out.println(Arrays.toString(arr));
		System.out.println("比较总次数为："+ sum1);
		System.out.println("交换总次数为："+ sum2);
	}
	
	
	
	
	
}
