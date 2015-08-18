package suanfa;
/**递归算法
 * 
 * @author tarena
 *
 */
import java.util.*;
public class DiGui {
	public static void main(String[] args){
		System.out.println("请输入1个大于等于1的整数：");
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		long y=fac(n);
		System.out.println(y);
	}
	public static long fac(int n){
		if(n==1) return(1);
		return n*fac(n-1);
	}
}