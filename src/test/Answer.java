package test;
/**Java的方法参数传递：
 * 只传递值！
 * 特点如下：
 * 1）基本数据类型传递的是值本身。(会在方法中新建一个变
 * 量，在方法中进行的操作不会影响原变量)
 * 2）引用数据类型传递的是引用的值，是对象的地址，而非
 * 对象本身。(方法中进行的操作会直接影响对象本身！)*/
public class Answer {
	public static void main(String[] args) {
		int score = 20;
		Answer ans = new Answer();
		ans.add(score);
		System.out.println("main: score = "+score);
	}
	void add(int score){
		System.out.println("add: score = "+score++);
	}
}
