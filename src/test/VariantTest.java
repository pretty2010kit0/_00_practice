package test;

import org.junit.Test;

/**
 * @author tarena
 * 静态变量和实例变量
 * 静态变量属于类，加载类就分配空间，可以使用了，可直接使用类名来引用。
 * 实例变量属于对象，创建实例对象时才分配空间，只能通过对象来引用。
 */
public class VariantTest{
	/**
	 * 无论创建了多少个实例对象，永远都只分配了一个staticVar变量。
	 * 每创建一个实例对象，staticVar的值就会加1.
	 * 
	 * 但是，每创建一个实例对象，就会分配一个instanceVar变量，
	 * 即可能分配多个instanceVar，并且每个instanceVar的值都只
	 * 自加了一次。
	 * */
	public static int staticVar = 0; 
	public int instanceVar = 0; 
	public VariantTest(){
		staticVar++;
		instanceVar++;
		System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
	}
	
}
