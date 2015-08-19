package suanfa;

import java.util.Scanner;

public class CaiShuZiDoWhile {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int k=(int)(Math.random()*1000)+1;
		System.out.println("请输入你的猜测值(1-1000),输入0退出游戏 : ");
		int n=in.nextInt();
		do{
			if(n==0){
				break;
			}else if(n<k){
				System.out.println("小");
			}else if(n>k){
				System.out.println("大");
			}
			n=in.nextInt();
		}while(n!=k);
		in.close();
		System.out.println("随机产生的数字为:"+k);
		if (n==0) {
			System.out.println("真遗憾,下次继续努力！");
		}else{
		System.out.println("恭喜你,猜对了");
		}	
	}

}
