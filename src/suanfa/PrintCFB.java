package suanfa;

public class PrintCFB {

	/**
	 * 打印九九乘法表
	 */
	public static void main(String[] args) {
		for(int a=1;a<10;a++){
			for(int b=1;b<=a;b++){
				System.out.print(b+"*"+a+"="+a*b+"	");//" "间是Tab
			}
			System.out.print("\n");
		}
	}

}
