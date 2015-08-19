package suanfa;

public class Pi {

	/**
	 * 元周率的精确计算
	 */
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		double pi=0,k=-1;
		int x= 10000000;
		for(int n=1;n<=x;n+=2){
			System.out.println(100.0*n/x+"%"+"    "+pi);
			k*=-1;
			pi=(pi+k*(1.0/n));
		}
		System.out.println("pi="+4*pi);
		long time2 = System.currentTimeMillis();
		System.out.println("time="+(time2-time1)+"ms");
		
		
	}

}
