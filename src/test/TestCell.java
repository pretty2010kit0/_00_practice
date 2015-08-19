package test;

public class TestCell {
	private int id;
	public TestCell(){
	}
	public TestCell(int id){
		this.id=id;
	}
	public void updateId(int id){
		this.id = id;
	}
	public static void main(String[] args) {
		TestCell c = new TestCell(1001);
		c.updateId(1002);
		System.out.println(c.id);
	}
}
