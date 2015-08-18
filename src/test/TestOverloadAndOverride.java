package test;

public class TestOverloadAndOverride {
	public class Tetromino{
		protected int move(int x){
			return 0;
		}
	}
	class T extends Tetromino{
		/*插入代码*/
		public int move(int x){return 0;}//重写
		private int move(long x){return 0;}//重载
	}
}
/** A 
 *  public int move(int x){return 0;}
 *  
 *  B
 *  private int move(long x){return 0;}
 *  
 *  A,B两段代码都没有编译错误
 *  子类重写父类方法原则：两同两小一大
 *  两同：方法名相同，形参列表相同。
 *  两小：子类返回值类型比父类更小或相等。
 *  	  子类方法声明抛出的异常类型比父类更小或相等。
 *  一大：子类方法的访问权限比父类更大或相等。
 * */

