<<<<<<< HEAD
package test;

public class ABCD {
	static boolean foo(char c){
		System.out.print(c);
		return true;
	}
	public static void main(String[] args) {
		int i = 0;
		for (foo('A'); foo('B')&&(i<2); foo('C')) {
			i++;
			foo('D');
		}
	}
}
=======
package test;

public class ABCD {
	static boolean foo(char c){
		System.out.print(c);
		return true;
	}
	public static void main(String[] args) {
		int i = 0;
		for (foo('A'); foo('B')&&(i<2); foo('C')) {
			i++;
			foo('D');
		}
	}
}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
