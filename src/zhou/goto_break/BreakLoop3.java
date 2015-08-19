package zhou.goto_break;

//Using break with nested loops. 
//在一系列嵌套循环中使用break 语句时，它将仅仅终止最里面的循环。
class BreakLoop3 {
	public static void main(String args[]) {
		for (int i = 0; i < 3; i++) {
			System.out.print("Pass " + i + ":");
			for (int j = 0; j < 100; j++) {
				if (j == 10)
					break; // terminate loop if j is 10
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Loops complete.");
	}
}