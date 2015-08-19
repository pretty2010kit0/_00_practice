package suanfa;

public class BreakOuter {
	public static void main(String[] args) {
		boolean flag=false;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i==3 || i==7) {
					break;
				}
				if (i==5) {
					flag=true;
					break;
				}
				System.out.print(j+"\t");
			}
			if(flag){
				break;
			}
			
			System.out.println();
		}
	}
}
