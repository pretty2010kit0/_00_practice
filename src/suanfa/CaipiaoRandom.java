package suanfa;
import java.util.*;
public class CaipiaoRandom {

	/**
	 * 彩票双色球生成器
	 * 红球：6个
	 * 随机生成01～32中6个不重复的随机号码
	 * 篮球：1个
	 * 随机生成01～07中一个随机号码
	 * 0<=Random(n)<n;	
	 *  */
	public static void main(String[] args) {
		System.out.print("输入0开始摇码！");
		Scanner in= new Scanner(System.in);
		int a =in.nextInt();
		int[] arr=new int[7];
		Random ran=new Random();
		int i=0;
		if(a==0){
			for(;i<6;i++){
				arr[i]=ran.nextInt(32)+1;
				for(int k=0;k<i;){
					if(arr[i]!=arr[k]) 
						k++;
					else arr[i]=ran.nextInt(32)+1;
					}
				System.out.print(arr[i]+"   ");
			}
			arr[i]=ran.nextInt(7)+1;
			System.out.println(arr[i]);
		}else{
			System.out.println("请重新输入");
		}
	}
}