package test;

import java.math.BigInteger;

/**
 * 理论上，BigInteger存放的整数位数只受内存容量影响。
 * 
 * */
public class TestBigInteger {
    public static void main(String[] args) {
        //将一个整数的基本类型转换位BigInteger的实例
        BigInteger num = new BigInteger("1");
        num = BigInteger.valueOf(1);
        //BigInteger同样支持:加add,减subtract,
        //乘multiply,除divide等运算
        //eg：1～200的阶乘
        for (int i = 1; i <= 200; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }
        System.out.println("结果"+num.toString().length()+"位");
        System.out.println(num);
    }
}
