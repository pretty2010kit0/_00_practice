package test;
/**java中没有无条件跳转的命令 臭名昭著的goto在java中已经取消  只作为保留字
 * 在java中可以使用跳转标签，但是标签只能放在一个固定的位置
 * */
public class BreakLableDemo {
	public static void main(String[] args) {
			mylabel://只能放这里
			for (int i = 0; i < 100; i++) {
			System.out.println("i=" + i);
			for (int j = 0; j < 100; j++) {
				System.out.println("j=" + j);
				break mylabel;//无条件跳转出两重循环
			}
		}

	}
}
