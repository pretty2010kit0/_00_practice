package suanfa;

import java.util.Scanner;

public class AdditionTestFor {

	/**
	 * 程序依次出10道加法题，用户输入答案。每答完一道题，给出对错。答完10道题，给出得分。
	 * 若想中途退出，输入-1
	 */
	public static void main(String[] args) {
		System.out.println("100以内加法测试开始！一共10道题");
		System.out.println("(中途退出请输入-1)");
		int k=0;
		Scanner in = new Scanner(System.in);
		for(int i=1;i<=10;i++){
			int a =(int) (Math.random()*100);
			int b =(int) (Math.random()*100);
			System.out.println(i+")"+a+"+"+b+"= ?");
			int c =in.nextInt();
//			秘籍
			if(c==53202955){
				System.out.println("使用秘籍！");
				k=11-i;
				break;
			}
//			--------------------------------------
			if(c==-1){
				break;
			}else if(c==a+b){
				System.out.println("回答正确");
				k++;
			}else{
				System.out.println("回答错误");
			}
		}
		System.out.println("测试结束,得分: "+k*10);
	}

}
