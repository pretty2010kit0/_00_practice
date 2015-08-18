package test;

import java.util.Arrays;
import java.util.Random;

public class DoubleColorBall {
	public static void main(String[] args) {
		// 生成球池，存放球
		String[] tools = new String[33];
		// 与球池对应的boolean数组 用来去除重复
		boolean[] used = new boolean[33];
		// 用来存放取出的红球
		String[] balls = new String[6];
		for (int i = 0; i < tools.length; i++) {
			if (i < 9) {
				tools[i] = "0" + (i + 1);
			} else {
				tools[i] = i + 1 + "";
			}
		}
		Random r = new Random();// 实例化Random对象
		int i = 0;
		int index = 0;
		while (true) {
			index = r.nextInt(tools.length);
			if (!used[index]) {
				// 如果这个下标对应的boolean元素为false 使用这个下标
				balls[i++] = tools[index];
			}
			//用完index后 把index对应的boolean元素改为true
			//下次再生成重复的index时 不能使用它
			used[index] = true;
			if (i == 6) {
				break;
			}
		}
		Arrays.sort(balls);//给balls数组排序
		index = r.nextInt(16);
		//扩容数组
		balls = Arrays.copyOf(balls, balls.length + 1);
		balls[balls.length - 1] = tools[index];
		System.out.println(Arrays.toString(balls));
	}
}
