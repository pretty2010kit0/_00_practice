package test;

import org.junit.Test;

public class VariantTestTest {
	/**
	 * 无论创建了多少个实例对象，永远都只分配了一个staticVar变量。
	 * 每创建一个实例对象，staticVar的值就会加1.
	 * 
	 * 但是，每创建一个实例对象，就会分配一个instanceVar变量，
	 * 即可能分配多个instanceVar，并且每个instanceVar的值都只
	 * 自加了一次。
	 * */
	@Test
	public void test(){
		for (int i = 0; i < 10; i++) {
			new VariantTest();
		}
	}
}
