package day04;

/*
*描述此段代码的功能：（ 解决费氏数列问题 ）
*/
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入Fibonacci数列的项数 n = ？");
        int n = scanner.nextInt();
        scanner.close();
        //次句的含义何在？（ 调用fibonacci方法，并接收该方法的返回值 ）
long result = fibonacci(n);
        if (result > 0) {
            System.out.println("Fibonacci[" + n + "] = " + result);
        } else {
            System.out.println("Fibonacci[" + n + "] 数值太大，溢出！");
        }
    }
//此方法实现的功能？（ 实现费氏数列的算法 ）
    public static long fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;
        long f1 = 1;
        long f2 = 1;
        for (int i = 3; i <= n; i++) {
            f2 = f1 + f2;
            f1 = f2 - f1;
        }
        return f2;
    }
}