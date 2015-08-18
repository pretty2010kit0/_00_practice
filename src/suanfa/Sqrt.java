package suanfa;

//求平方根：
//===============
import java.util.Scanner;
public class Sqrt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number :a =");
        double a = scanner.nextDouble();
        scanner.close();
        System.out.print("a is Prime is "+sqrt(a));
    }    
    public static double sqrt(double c){
        if (c < 0)return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c/t) > err * t)
            t = (c/t + t)/2.0;
        return t;
    }
    }
