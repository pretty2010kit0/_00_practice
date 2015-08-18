package suanfa;
import java.util.Scanner;
import java.util.Random;
/**
 * 随机生成一个1～1000的整数数字k
 * 输入猜测数值n
 * 若n<k 显示“小”
 * 若n>k 显示“大”
 * 若n=k 显示 “恭喜你，用了m次猜中!”
 */
public class CaiShuZiFor1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Random ran=new Random();
		int k=ran.nextInt(1000)+1;
		System.out.print("请输入你的猜测值(1-1000)(输入0退出游戏): ");
		int n=in.nextInt();
		int i;
		for(i=1;n!=0;i++){
			if(n<k){
				System.out.println("小");
			}else if(n>k){
				System.out.println("大");
			}else break;
			n=in.nextInt();
		}
		System.out.println("随机产生的数字为:"+k);
		if (n==0) {
			System.out.println("真遗憾,下次继续努力！");
		}else{
		System.out.println("恭喜你,用了"+i+"次猜中!");

		}	
	}
}