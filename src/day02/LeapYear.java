package day02;
/*
 *描述此段代码的功能：（ 判断某年是否为闰年 ）
 */
 import java.util.Scanner;
 public class LeapYear {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("请输入年份（例如：2012）");
         int year = scanner.nextInt();
 // 此语句意义何在？( 根据闰年条件判断某年是否为闰年 )
         boolean isLeapYear = (year % 4 == 0 && year % 100 != 0)
                 || year % 400 == 0;
         String msg = isLeapYear ? year + "是闰年" : year + "不是闰年";
         System.out.println(msg);
     }
 }