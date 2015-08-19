package day05;
import javax.swing.JFrame;
public class RectChangFangXing {
	int x,y,width,height;//在类中添加属性
	//在类中添加修改位置的方法	 
	public static void main(String[] args){
		RectChangFangXing r=new RectChangFangXing();
		r.setLocation(100,200);
		r.setSize(50, 60);
		System.out.println("r :"+r.toString());
		testNew();
		testEquals();
		JFrame frame = new JFrame(); 
      frame.setSize(500, 600);
      frame.setTitle("TestFrame");
      frame.setLocation(100, 100);
//      在桌面上显示一个窗口使用setVisible(true)方法, 如果参数是false就是关闭一个窗口对象.
      frame.setVisible(true);
//      使用如下代码可以实现, 在关闭窗口时候同时退出应用程序.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void setLocation(int x1,int y1){
			x=x1;
			y=y1;
		}
//		在类中添加修改大小的方法
	public void setSize(int w,int h){
			width= w;
			height= h;
		}
//		在类中添加toString()方法用于输出对象的文本描述,方便调试输出
	public String toString(){
			return "x="+x+",y="+y+",width="+width+",height="+
		height;
		}
	public static void testNew(){
		RectChangFangXing r1= new RectChangFangXing();
		RectChangFangXing r2= new RectChangFangXing();
		r1.x=100;
		r1.y=200;
		r1.width=50;
		r1.height=60;
		System.out.println("r1:"+r1);
		r2.x=300;
		r2.y=400;
		r2.width=60;
		r2.height=80;
		System.out.println("r2:"+r2);		
	}
	/**扩展

使用 "==" 运算符不能判断对象是否相等:

使用new运算创建的对象, 是在不同物理地址上分配的物理对象, 引用的值是对象首地址的值, 
即便属性值相同的对象, 也是不同的物理对象, 使用==运算只能判断引用值是否相等, 
只能判断是否是同一个物理位置对象. 不能用于判断对象属性是否相等.

两个引用变量可以引用同一个对象.

引用变量可以赋值, 赋值以后两个引用变量的值相同, 是同一个物理对象首地址值.

在TestRect中添加测试方法:
*/
    public static void testEquals() {
    	  RectChangFangXing r1 = new RectChangFangXing();
        r1.x = 100;
        r1.y = 200;
        System.out.println(r1);
        RectChangFangXing r2 = new RectChangFangXing();
        r2.x = 100;
        r2.y = 200;
        System.out.println(r2);
        System.out.println(r1 == r2);
        RectChangFangXing r3 = r1;
        r3.x = 300;
        r3.y = 400;
        System.out.println(r3);
        System.out.println(r1);
    }
}

