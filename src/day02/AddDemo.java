package day02;
/**加法练习器
 */
import java.util.Scanner;
import java.util.Random;
public class AddDemo {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			Scanner console= new Scanner(System.in);
			Random r= new Random();
			int a= r.nextInt(10);
			int b= r.nextInt(10);
			System.out.print(a+"+"+b+"=");
			int c= console.nextInt();
			if(c==a+b){
				System.out.println("Right!数学不错吗!");
			}else{
				System.out.println("Wrong!!!恭喜你, 快上小学吧!");
			}
		}	
			
	}
}