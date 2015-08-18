package suanfa;

public class ZuiDaGYS {

	/**
	 * 最大公约数
	 */
	public static void main(String[] args) {
		int a= 15,b=5;
		int c= gys(a,b);
		System.out.println(c);
		
		
	}
	public static int gys(int x,int y){
		if(y==0) return x;
		int r= x%y;
		return gys(y,r);
	} 

}
