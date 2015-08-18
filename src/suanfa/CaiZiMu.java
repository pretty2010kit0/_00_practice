package suanfa;

import java.util.Arrays;
import java.util.Scanner;


public class CaiZiMu {
	public static void main(String[] args) {
		System.out.println("Zhou's Game!\n欢迎进入猜字母游戏!\n游戏开始");
		int level = 5;//表示游戏等级 
		int score = 0;//表示猜测次数
		char[] ch1= new char[level];
		int[] result = new int[2];
		Generate(ch1);//产生随机字母串
//		System.out.println("产生的字母序列为: "+Arrays.toString(ch1));
		System.out.println("请输入你所猜测的"+level+"个不相同的字母序列:(输入exit退出)");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			//去掉字符串前后的空格并将其全部改为大写
			String inputStr = scanner.next().trim().toUpperCase();
			if (inputStr.equals("EXIT")) {
				System.out.println("Game over!\nThanks for using!\nbye-bye!\n -_-");
				break;
			}
//			------------秘籍
			if(inputStr.equals("MIJIHAHA")){
				System.out.println("欢迎使用秘籍！");
				score = 100*level - 10*score;
				System.out.println("GuessingGame>恭喜你猜对了！你的得分是： "+score);
				break;
			}
//			------------------------------------
			char[] ch2 = inputStr.toCharArray();
			result = check(ch1,ch2);
			if (result[0] == level ) {//完全猜对
				score = 100*level - score*10;
				System.out.println("恭喜你！你全部猜对了！ 你的得分是："+score);
				break;
			}else {
				score++;
				System.out.println("你猜对"+result[1]+"个字符，其中"+result[0]+
						"个字符的位置正确！（总次数=）"+score+"\nexit--退出");
			}
		}
		scanner.close();
		System.out.println("产生的字母序列为: "+Arrays.toString(ch1));
		
		
		 
	}
	/**随机生成需要猜测的字母序列，存储在ch1数组中(每有相同的字母)
	 * 
	 * @param a
	 * ch1 存储随机字符的数组
	 */
	public static void SJ(char[] ch1){
		for (int i = 0; i < ch1.length;i++) {
			ch1[i]=(char)((int)(Math.random()*26)+'A');
			for (int j = 0; j < i;j++) {
				if(ch1[i]==ch1[j]){
					ch1[i]=(char)((int)(Math.random()*26)+65);
					j=-1;
				}
			}
		}
	}
//	代码优化  生成随机字母的方法
	public static void Generate(char[] ch1 ){
		boolean[] flags = new boolean[26];
		for (int i = 0; i < ch1.length; i++) {
			int index;
			do{
				index = (int)(Math.random()*26);
			}while(flags[index]);
			ch1[i] = (char)(index+'A');
			flags[index] = true;
		}
	}
	
	
	
	
	/**比较玩家输入的字母序列和程序所生成的字母序列，逐一比较字符及其位置，并记载比较结果
	 * ch1 
	 * 程序生成的字符序列
	 * input 
	 * 玩家输入的字符序列
	 * return
	 * 存储比较的结果。返回值int数组的长度为2，其中，索引为0的位置用于存放完全猜对的字母个数（
	 * 字符和位置都正确），索引1的位置存储猜对的字母个数|(字符正确，位置一定正确)
	 */
	public static int[] check(char[] ch1,char[] ch2){
		int[] a = new int[2];
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < ch1.length; j++) {
				if (ch2[i]==ch1[j]) {
					a[1]++;
					if (i==j) {
						a[0]++;
					}
					break;
				}
			}
		}
		return a;
	}

	
}
