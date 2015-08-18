package zhou.method;

/**
 * 递归
 * 
 * 能调用自身的方法称为递归方法(recursion method),而且
 * 这个过程被称为递归(recursion)。
 * 
 * 也有间接的递归，即方法A调用方法B，而方法B又再次调用方法A。
 * 显然，如果不想这个过程无限继续，就必须在递归方法中包含一些
 * 逻辑，让它最终能停止调用自身。
 * 
 * 作为规则，应该只有当使用递归有明显优势时才使用它，因为递归
 * 方法调用会产生大量的负载。 
 * 使用循环往往更容易编写，执行也更有效。
 * 
 * @author zhoupc
 *
 */
public class RecursionDemo {

	public static void main(String[] args) {
		// 计算 2 的 4 次方
		System.out.println(power(2.0, 4));
		
	}
	
	
	
	// 计算x的n次方
	static double power(double x, int n){
		if(n > 1){
			return x*power(x, n-1); // recursion call
		} else if(n < 0){
			return 1.0/power(x, -n); // Negative power of x
		} else{
			return n == 0 ? 1.0 : x; // When n is 0 return 1, otherwise x
		}
	}
}
