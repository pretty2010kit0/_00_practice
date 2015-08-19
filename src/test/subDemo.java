package test;

public class subDemo {
	public static void main(String[] args) {
		System.out.println("someapp/manager/emplist.action");
		String str ="someapp/manager/emplist.action"; 
		int index = str.lastIndexOf("/");
		System.out.println(index);
		String subStr = str.substring(index+1);
		System.out.println(subStr);
	}
}
