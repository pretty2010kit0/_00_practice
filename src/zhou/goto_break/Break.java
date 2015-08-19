<<<<<<< HEAD
package zhou.goto_break;

//Using break as a civilized form of goto. 
class Break {
	public static void main(String args[]) {
		boolean t = true;
		first: {
			second: {
				third: {
					System.out.println("Before the break.");
					if (t)
						break second; // break out of second block
					System.out.println("This won't execute");
				}

				System.out.println("This won'texecute");
			}
			System.out.println("This is after secondblock.");

		}
	}
=======
package zhou.goto_break;

//Using break as a civilized form of goto. 
class Break {
	public static void main(String args[]) {
		boolean t = true;
		first: {
			second: {
				third: {
					System.out.println("Before the break.");
					if (t)
						break second; // break out of second block
					System.out.println("This won't execute");
				}

				System.out.println("This won'texecute");
			}
			System.out.println("This is after secondblock.");

		}
	}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
}