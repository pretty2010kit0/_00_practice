package zhou.goto_break;

//Using continue with a label. 
class ContinueLabel {

	public static void main(String args[]) {
		outer: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j > i) {
					System.out.println();
					//终止本次i循环，开始下次i循环
					continue outer;
				}
				System.out.print(" " + (i * j));
			}
		}
		System.out.println();
	}

}