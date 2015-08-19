<<<<<<< HEAD
package zhou.goto_break;
public class Continue1 {
	public static void main(String[] args) {
		outer1: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j > i) {
					System.out.println();
					// 结束本次i循环，开始下次i循环
					continue outer1;
				} else {
					System.out.print("*");
				}
			}
		}

		System.out.println("\n---------------------------");
		
		outer2: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j > i) {
					System.out.println();
					// 结束i循环
					break outer2;
				} else {
					System.out.print("*");
				}
			}
		}
	}

}
=======
package zhou.goto_break;
public class Continue1 {
	public static void main(String[] args) {
		outer1: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j > i) {
					System.out.println();
					// 结束本次i循环，开始下次i循环
					continue outer1;
				} else {
					System.out.print("*");
				}
			}
		}

		System.out.println("\n---------------------------");
		
		outer2: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j > i) {
					System.out.println();
					// 结束i循环
					break outer2;
				} else {
					System.out.print("*");
				}
			}
		}
	}

}
>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
