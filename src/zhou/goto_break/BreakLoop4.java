<<<<<<< HEAD
package zhou.goto_break;

//Using break to exit from nested loops 
class BreakLoop4 {
	public static void main(String args[]) {
		outer: for (int i = 0; i < 3; i++) {
			System.out.print("Pass " + i + ":");
			for (int j = 0; j < 100; j++) {
				if (j == 10)
					break outer; // exit both loops
				System.out.print(j + " ");
			}
			System.out.println("This will notprint");
		}
		System.out.println("Loops complete.");
	}
=======
package zhou.goto_break;

//Using break to exit from nested loops 
class BreakLoop4 {
	public static void main(String args[]) {
		outer: for (int i = 0; i < 3; i++) {
			System.out.print("Pass " + i + ":");
			for (int j = 0; j < 100; j++) {
				if (j == 10)
					break outer; // exit both loops
				System.out.print(j + " ");
			}
			System.out.println("This will notprint");
		}
		System.out.println("Loops complete.");
	}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
}