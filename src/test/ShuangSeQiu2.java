package test;

import java.util.Arrays;
import java.util.Random;

public class ShuangSeQiu2 {
	public static void main(String[] args) {
		
		String[] tools = new String[33];//生成球池,存放球
		boolean[] used = new boolean[33];//
		String[] balls = new String[6];
		for (int i = 0; i < tools.length; i++) {
			if (i<9) {
				tools[i] = "0"+(i+1);
			} else {
				tools[i]= i+1+"";
			}
		}
		Random ran = new Random();//实例化Random对象
		int i = 0;
		int index = 0;
		while(true){
			index = ran.nextInt(tools.length);
			if (!used[index]) {
				balls[i++] = tools[index];
			}
			used[index] = true;
			if(i==6){
				break;
			}
		}
		Arrays.sort(balls);
		index = ran.nextInt(16);
		balls = Arrays.copyOf(balls, balls.length+1);
		balls[balls.length-1] = tools[index];
		System.out.println(Arrays.toString(balls));
	}
}
