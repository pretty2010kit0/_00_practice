<<<<<<< HEAD
package test;

public class ReloadOverrideTest {

}

class Blip{
	protected int blipvert(int x){
		return 0;
	}
}

// 1 重写，方法名，参数列表和返回值都相同，子类的访问权限大于等于父类
class Vert1 extends Blip{
	public int blipvert(int x){return 0;}
}

// 2 编译错误，重写时方法的访问权限不能减小
class Vert2 extends Blip{
	//private int blipvert(int x){return 0;}
}

// 3 重载，方法的参数列表不同
class Vert3 extends Blip{
	private int blipvert(long x){return 0;}
}

// 4 重写，返回值类型不能改变
class Vert4 extends Blip{
	//protected long blipvert(int x){return 0;}
}


=======
package test;

public class ReloadOverrideTest {

}

class Blip{
	protected int blipvert(int x){
		return 0;
	}
}

// 1 重写，方法名，参数列表和返回值都相同，子类的访问权限大于等于父类
class Vert1 extends Blip{
	public int blipvert(int x){return 0;}
}

// 2 编译错误，重写时方法的访问权限不能减小
class Vert2 extends Blip{
	//private int blipvert(int x){return 0;}
}

// 3 重载，方法的参数列表不同
class Vert3 extends Blip{
	private int blipvert(long x){return 0;}
}

// 4 重写，返回值类型不能改变
class Vert4 extends Blip{
	//protected long blipvert(int x){return 0;}
}


>>>>>>> d5796f63539d069b3813af43e6c2250a2745efd0
