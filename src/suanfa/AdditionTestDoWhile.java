package suanfa;

import java.util.Scanner;

public class AdditionTestDoWhile {

	/**
	 * 程序依次出10道加法题，用户输入答案。每答完一道题，给出对错。答完10道题，给出得分。
	 * 若想中途退出，输入-1
	 */
	public static void main(String[] args) {
		System.out.println("100以内加法测试开始！一共10道题：");
		System.out.println("(中途退出请输入-1)");
		int i=1;
		int k=0;
		Scanner in = new Scanner(System.in);
		do{
			int a =(int) (Math.random()*100);
			int b =(int) (Math.random()*100);
			System.out.print(i+")"+a+"+"+b+"= ?");
			int c =in.nextInt();
			if(c==-1){
				System.out.println("测试中断，得分: "+k*10);
				return;
			}else if(c==a+b){
				System.out.println("回答正确");
				k++;
			}else{
				System.out.println("回答错误");
			}
			System.out.println("得分: "+k*10);
			i++;
		}while(i<=10);
		System.out.println("测试结束，得分: "+k*10);
		
	}

}
