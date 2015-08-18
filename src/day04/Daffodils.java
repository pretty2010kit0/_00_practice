package day04;
/**
*描述此段代码的功能：（ 计算某个范围内所有水仙花数 ）
*水仙花数： 一个整数满足其值等于各个数位的立方和
    *如 153=1*1*1+5*5*5+3*3*3
*/
import java.util.Scanner;
public class Daffodils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入查找水仙花的范围：0~");
        int max = scanner.nextInt();
        scanner.close();
        for (int n = 1; n <= max; n++) {
            int sum = 0;
//下列for语句和if语句实现的功能（ 判断n是否为水仙花数 ）
            for (int m = n; m > 0; m /= 10) {
                int v = m % 10;
                sum += v * v * v;
            }
            if (n == sum) {
                System.out.print(n + " ");
            }
        }
    }
}