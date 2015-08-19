package test;

import java.math.BigInteger;

import org.junit.Test;

public class BreakOk {
	/**跳出多层循环1
	 * 使用标号
	 * */
	@Test
	public void break1(){
		ok:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("i="+i+",j="+j);
				if (j == 3) {
					break ok;
				}
			}
		}
	}
	
	/**跳出多层循环2
	 * 外层的循环条件表达式受到内层的循环代码的控制
	 * */
	@Test
	public void break2(){
		int[][] arr = {{1,2,3},{4,5,6,7},{9}};
		boolean found = false;
		for (int i = 0; i < arr.length && !found; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("i="+i+",j="+j);
				if (arr[i][j] == 5) {
					found = true;
					break;
				}
			}
		}
	}
	
	
	/**
	 * 用最优效率的方法算出2乘以8等于几？
	 * 使用位运算的方法，乘以8即左移3位，
	 * cpu直接支持位运算，效率最高。
	 */
	@Test
	public void weiyunsuan(){
		System.out.println(2 << 3);
	}
}
