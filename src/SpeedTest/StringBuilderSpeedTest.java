<<<<<<< HEAD
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
=======
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
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
