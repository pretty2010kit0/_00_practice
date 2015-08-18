package zhou.chararr;

public class LastLaugh {

	public static void main(String[] args) {
		System.out.print("H" + "a");

		System.out.print('H' + 'a');

	}
	/*
	 * 运行结果是Ha169，不是HaH
	 * 
	 * + 操作符当且仅当它的操作数中至少有一个是String类型时，才会执行
	 * 字符串连接操作；否则，它执行的就是加法。
	 * 
	 * */

}
