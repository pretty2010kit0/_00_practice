package suanfa;

import java.util.Arrays;

public class Array {
	public static void main(String[] args){
		int[] arr1={0,1,2,3,4,5,6,7,8,9};
		int[] arr2={0,1,2,3,4,5,6,7,8,9,10};
		
//		Arrays.toString方法	用于字符串表示数组的元素
		System.out.println("1) "+Arrays.toString(arr1));
		System.out.println("2) "+Arrays.toString(arr2));
		
//		Arrays.equals方法	用于比较两个数组的各个元素是否相等
		System.out.println("3) "+Arrays.equals(arr1,arr2));

		int[] arr3={58,96,15,34,45,84,1,35,46,72};
		String[] names={"Oscar","Edgar","frank","Laurent",
				"hugo","Jacob","Aaron","gino","Angus","Ken"};
		
//		Arrays.sort方法 用于实现数组的排列
		Arrays.sort(arr3); //按照数值大小顺序排列	
		Arrays.sort(names);//按照字典顺序排列
		System.out.println("4) "+Arrays.toString(arr3));
		System.out.println("5) "+Arrays.toString(names));
		
//		Arrays.binarySearch	方法  用于实现有序数组的二分法查找		
		int[] arr4={15,95,36,74,19,28,45,369,154,74,159};
		Arrays.sort(arr4);//排序
		System.out.println("6) "+Arrays.toString(arr4));//字符串打印数组元素
		int index=Arrays.binarySearch(arr4, 154);//返回下标值
		System.out.println("7) "+index);
		index=Arrays.binarySearch(arr4, 90);//找不到时,返回负数
		System.out.println("8) "+index);
		index=Arrays.binarySearch(arr4, 74);//有多个相等元素时不确定返回哪一个
		System.out.println("9) "+index);		
		
//		System.arraycopy方法	用于数组的复制
//		System.arraycopy(arr1,num1,arr2,num2,length);
//		arr1:复制的源数组 num1:起始位置
//		arr2:复制的目标数组 num2:起始位置
//		length: 要复制的元素个数
		String[] names1={"Oscar","Edgar","frank","Laurent",
				"hugo","Jacob","Aaron","gino","Angus","Ken"};
		String[] names2=new String[5];
		System.arraycopy(names1,3,names2,0,5);
		System.out.println("10) "+Arrays.toString(names2));
		
//		System.arraycopy(names1,0,names2,0,names1.length);
//		将数组names1的全部内容复制到names2中,但由于names2的长度小于
//		names1,方法会抛出异常(ArrayIndexOutOfBoundsException)
//		数组的扩展:数组的长度在创建后是不可改变的.所谓扩展是指创建一个更大的
//		新数组并将原有数组的内容复制到其中
		System.out.println("11) "+Arrays.toString(names1));
		String[] names3=names1;
		names1=new String[names1.length+1];
		System.arraycopy(names3, 0, names1, 0,names3.length);
		names1[names1.length-1]="Zhou";
		System.out.println("12) "+Arrays.toString(names1));
		
//		Arrays.copyOf 方法  简便实现数组复制和扩展
//		int[] a ={10,20,30,40,50};
//		int[] a1= Arrays.copyOf(a, 6);
//		结果为： 10  20  30  40  50  0
 		
		names1=Arrays.copyOf(names1, names1.length+1);
//		扩展后的数组           原数组		扩展后的长度
//		int[] a = {10,20,30,40,50};
//		a = Arrays.copyOf(a, 6);
//		a数组输出结果为： 10,20,30,40,50,0
		
//		toCharArray 方法		用于将字符串转成对应的字符数组
//		String inputStr = "zhoupengchao";
//     char[] input = inputStr.toCharArray();
		
//		toString方法  用于将字符数组转化为字符串
		char[] chs = {'z','h','o','u'};
		String chss = Arrays.toString(chs);
	//	System.out.println(Arrays.toString(chs));
		System.out.println(chss);
		
//		trim() 方法用于去掉字符串前后的空格
//		toUpperCase()	方法用于将字符全部改为大写
//		String inputStr = scanner.next().trim().toUpperCase();
		
		//数组填充
		Arrays.fill(chs,' ');
		System.out.println(Arrays.toString(chs));
	}

}