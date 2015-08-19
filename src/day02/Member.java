package day02;
import java.util.Scanner;
public class Member {
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		System.out.print("member1: ");
		String member1= scanner.next();
		System.out.print("member2: ");
		String member2= scanner.next();
		
		scanner.close();
		System.out.println(member1+" and "+member2);
		

		
	}

}