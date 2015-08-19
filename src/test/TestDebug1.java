package test;

public class TestDebug1 {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			int j = i+5;
			System.out.println(j);
		}
	}
}
