package test;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		testRandom();
	}
	/* 1）同一个种子得到的是一个固定的序列
	 * 2）不写种子,则默认以系统时间经过计算作为种子,一般不会重复*/
	public static void testRandom(){
		Random r1 = new Random(1);
		for(int i=0; i<10;i++){
            System.out.print(r1.nextInt(10)+" ");
        }
		System.out.println(r1.nextInt(10)+" ");
		
		Random r2 = new Random(1);
		for(int i=0; i<10;i++){
		    System.out.print(r2.nextInt(10)+" ");
		}
		System.out.println(r2.nextInt(10)+" ");
		
		Random r3 = new Random(2);
        for(int i=0; i<10;i++){
            System.out.print(r3.nextInt(10)+" ");
        }
        System.out.println(r3.nextInt(10)+" ");
        
        Random r4 = new Random();
        for(int i=0; i<10;i++){
            System.out.print(r4.nextInt(10)+" ");
        }
        System.out.println(r4.nextInt(10)+" ");
        
        Random r5 = new Random();
        for(int i=0; i<10;i++){
            System.out.print(r5.nextInt(10)+" ");
        }
        System.out.println(r5.nextInt(10)+" ");
	}
}
