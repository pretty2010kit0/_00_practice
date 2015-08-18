package test;

public class TestStaticMethod {
		static void alpha(){/*more code here*/}
		void beta(){/*more code here*/}
}
/**
 * TestStaticMethod.alpha()是调用alpha方法的正确方式。
 * beta方法可以直接调用alpha方法。
 * 
 * static修饰的方法是类的方法，不需要针对某些对象进行操作。
 * 其运行结果仅仅与输入的参数有关，用类名引调用。
 * 由于static方法在调用时没有当前对象this，因此在static方法
 * 中不能调用非static方法或访问非static属性。但是，非static
 * 方法可以调用static方法或访问static属性。
 * */
