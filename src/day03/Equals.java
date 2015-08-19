package day03;
import java.util.*;
public class Equals {
	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.print("请问你的性别是？（男/女）");
	String sex=in.next();
	if(sex.equals("女")){
		System.out.println("请问你的年龄是？");
		int age= in.nextInt();
		if(age>=18){
			System.out.println("成年了啊！");
		}else{
			System.out.println("还是个未成年啊");
		}
	}else{
		System.out.println("原来是个男孩啊");
	}
	}

}