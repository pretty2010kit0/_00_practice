package suanfa;

import java.util.Arrays;
import java.util.Scanner;

public class CaiZiMu1 {
	public static void main(String[] args) {
		int level = 5 ;
		int score = 0 ;
		char[] chs = new char[level];
		int[] result = new int[2];
		System.out.println("GuessingGame>欢迎尝试猜字母游戏! ");
		sj(chs);
//		System.out.println(Arrays.toString(chs));
		System.out.println("GuessingGame>游戏开始,请输入你所猜的"+level+"个字母序列 : (exit 退出):");
		Scanner scanner = new Scanner(System.in);
		while(true){
			String inputStr = scanner.next().trim().toUpperCase();
			if(inputStr.equals("EXIT")){
				System.out.println("GuessingGame>谢谢你的尝试,再见!");
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
			char[] input = inputStr.toCharArray();
			result=check(chs,input);
			if (result[0]==level) {
				score = 100*level - 10*score;
				System.out.println("GuessingGame>恭喜你猜对了！你的得分是： "+score);
				break;
			} else {
				score++;
				System.out.println("GuessGame>你猜对"+result[1]+"个字母，其中"+result[0]+
						"个字母的位置正确（总次数=）"+score+",exit退出");
			}
		}
		scanner.close();
		System.out.println("正确答案是:"+Arrays.toString(chs));
	}
	
//	生成字母序列(不产生相同的字母)
	public static void sj(char[] chs){
		char[] letters = {'A','B','C','D','E','F','G','H','I',
				'J','K','L','M','N','O','P','Q','R','S','T','U',
				'V','W','X','Y','Z'};
		boolean[] flags = new boolean[letters.length]; 
		for (int i = 0; i < chs.length; i++) {
			int index;
			do {
				index = (int)(Math.random()*26);
			} while (flags[index]);
			chs[i] = letters[index];
			flags[index] = true;
		}
	}
	
//	比较输入序列和生成序列，返回比较结果
//	int[0]存放完全正确的个数（字母和位置）  int[1] 存放猜对的字母数
	public static int[] check(char[] chs,char[] input ){
		int[] result = new int[2];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < chs.length; j++) {
				if (input[i] == chs[j]) {
					result[1]++;
					if (i == j) {
						result[0]++;
					}
					break;
				}
			}
		}
		return result;
		
	}
	
	
	
	
}
