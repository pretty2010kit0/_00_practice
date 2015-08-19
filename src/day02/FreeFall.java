package day02;
/*
*描述此段代码的功能：（ 计算自由落体运动中物体的位置 ）
*/
// 此语句意义何在？( 导入java.util包下的Scanner类 )
import java.util.Scanner;
public class FreeFall {
    public static void main(String[] args) {
// 此语句意义何在？( 创建接收控制台输入的类Scanner )
        Scanner scanner = new Scanner(System.in);
        double g = 9.81354;
        System.out.println("请输入自由下落的时间（秒）：");
// 此语句意义何在？( 使用double类型接收控制台输入的时间数据t )
        double t = scanner.nextDouble();
// 此语句意义何在？( 根据自由落体的位移公式计算出位移值s )
        double s = 0.5 * g * t * t;
// 此语句意义何在？( 取保保留一位小数 )
        s = Math.round(10 * s) / 10.0;
        System.out.println(t + "秒后，物体自由下落了" + s + "米");
    }
}