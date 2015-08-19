package FangWenXiuShiFu;

public class Test {
	public static void main(String[] args) {
		Aoo aoo = new Aoo();
		aoo.show();
		aoo.a = 2;
		aoo.b = 2;
		aoo.c = 2;
//		 aoo.d=2;
		aoo.e = 2;
		Aoo.e = 2;//e 不属于aoo  而属于 Aoo
		
		Aoo aoo2 = new Aoo();
		aoo2.show();
		
	}
}
