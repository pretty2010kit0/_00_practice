package test;

public class Teacher {
	private String name = "sun";
	public static void main(String[] args) {
		Teacher[] teachers = new Teacher[2];
		System.out.println(teachers[0]);
		System.out.println(teachers.length);
		System.out.println(teachers[0].name);
	}
}
