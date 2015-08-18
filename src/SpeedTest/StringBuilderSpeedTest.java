package SpeedTest;

public class StringBuilderSpeedTest {
	public static void main(String[] args) {
		test1();
		test2();
	}
	public static void test1(){
		long start = System.nanoTime();
		String s = "a";
		for (int i = 0; i < 50000; i++) {
			s+="a";
		}
		long end = System.nanoTime();
		System.out.println("ns:"+(end-start));
	}
	public static void test2(){
		long start = System.nanoTime();
		StringBuilder s = new StringBuilder("a");
		for (int i = 0; i < 50000; i++) {
			s.append("a");
		}
		long end = System.nanoTime();
		System.out.println("ns:   "+(end-start));
	}
}
