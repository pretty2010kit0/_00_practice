package zhou.goto_break;

//This program contains an error. 
//记住如果一个标签不在包围break的块中定义，你就不能break 到该标签。
//因为标签为one的循环没有包围break 语句，所以不能将控制传递到该块。 
class BreakErr {
	public static void main(String args[]) {
		one: for (int i = 0; i < 3; i++) {
			System.out.print("Pass " + i + ":");
		}
		for (int j = 0; j < 100; j++) {
			if (j == 10)
				break one; // WRONG
			System.out.print(j + " ");
		}
	}
}