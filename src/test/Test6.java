package test;

public class Test6 {
	public static void main(String[] args) {
		int s = 105;
		int result = 0;
		while(s>0){
			System.out.println("s:"+s);
			int m = s%10;
			result += m;
			s /= 10;
			System.out.println("m="+m+",result="+result+",s="+s);
		}
		System.out.println("result:"+result);
	}
}
