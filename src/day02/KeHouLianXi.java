package day02;
import java.util.Scanner;
import java.util.Random;
public class KeHouLianXi {

	public static void main(String[] args) {
	    /*
		    *描述此段代码的功能：（ 计算自由落体运动中物体的位置 ）
		    */
		    // 此语句意义何在？( 导入java.util包下的Scanner类 )
		    
		    
		    // 此语句意义何在？( 创建接收控制台输入的类Scanner )
		            Scanner scanner = new Scanner(System.in);
		            double g = 9.8165;
		            System.out.println("请输入自由下落的时间（秒）：");
		    // 此语句意义何在？( 使用double类型接收控制台输入的时间数据t )
		            double t = scanner.nextDouble();
		    // 此语句意义何在？( 根据自由落体的位移公式计算出位移值s )
		            double s = 0.5 * g * t * t;
		            System.out.println("s= "+s);
		    // 此语句意义何在？( 取保保留一位小数 )
		            s = Math.round(10 * s) / 10.0;
		            System.out.println("s= "+s);
		            System.out.println(t + "秒后，物体自由下落了" + s + "米");
		            
		            /*
		            *描述此段代码的功能：（ 计算sgn (x)函数的值 ）
		            */		            
		            Scanner scanner1 = new Scanner(System.in);
		            System.out.println("符号函数sgn（x）");
		            System.out.println("请输入x的值（double）");
		            double x = scanner1.nextDouble();
		    // 此语句意义何在？( 使用三目运算符计算符号函数sgn(x)的值 )
		            int sgn = x > 0 ? 1 : (x < 0 ? -1 : 0);
		            System.out.println("sgn(" + x + ")=" + sgn);
		            
//		            加法练习器
		            
		         
		            
		                    Scanner console = new Scanner(System.in);
		                    Random r = new Random();
		                    int a = r.nextInt(10);
		                    int b = r.nextInt(10);
		                    System.out.print(a+"+" + b + "=?");
		                    int c = console.nextInt();
		                    if(c==a+b){
		                        System.out.println("数学不错吗!");
		                    }else{
		                        System.out.println("恭喜你, 快上小学吧!");
		                    }
		              
//		                     修改上述案例将Tom和Merry通过控制台接收输入获得，
//		                    和“and”拼接成一个字符串“Tom and Merry”，输出到控制台。
		                    Scanner scanner2 = new Scanner(System.in);
		                    System.out.println("请输入第一个成员：");
		                    String first = scanner2.next();
		                    System.out.println("请输入第二个成员：");
		                    String second = scanner2.next();
		                    scanner.close();
		                    System.out.println(first + " and " + second);

		            
		            
	}
		    

}

